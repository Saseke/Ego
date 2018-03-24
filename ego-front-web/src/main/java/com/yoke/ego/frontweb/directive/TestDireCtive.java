package com.yoke.ego.frontweb.directive;

import com.yoke.ego.common.pojo.Category;
import com.yoke.ego.frontweb.util.DirectiveUtil;
import com.yoke.ego.service.CategoryService;
import freemarker.core.Environment;
import freemarker.template.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestDireCtive implements TemplateDirectiveModel {
    private static final String TEST_ID = "id";
    private static final String TEST_SITEID = "siteId";

    @Autowired
    private CategoryService categoryService;

    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {
        Integer id = Integer.valueOf(String.valueOf(DirectiveUtil.getString(TEST_ID, map)));
        String siteid = DirectiveUtil.getString(TEST_SITEID, map);
        Category category = categoryService.selectByPrimaryKey(id);
        List<String> strs = new ArrayList<String>();
        strs.add(category.toString());
        DefaultObjectWrapperBuilder builder = new DefaultObjectWrapperBuilder(Configuration.getVersion());
        environment.setVariable(≥);
        if (templateDirectiveBody != null) {
            templateDirectiveBody.render(environment.getOut());
        }
    }
}
