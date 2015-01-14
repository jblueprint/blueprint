package org.blueprint.model;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class ModelTest {

    @Test
    public void testModelToJSON() {
        Model model = new Model();

        model.setName("TestModel");
        model.setDisplayName("测试用模型");
        model.setVersion("1.0");

        Entity user = new Entity();
        user.setName("User");
        user.setDisplayName("用户");

        Property property = new Property();
        property.setName("name");
        property.setDisplayName("名称");
        property.setType(Type.STRING);

        user.addProperty(property);

        property = new Property();
        property.setName("displayName");
        property.setDisplayName("显示名称");
        property.setType(Type.STRING);

        user.addProperty(property);

        model.addEntity(user);

        String json = JSON.toJSONString(model);

        System.out.println(json);

        Model model2 = JSON.parseObject(json, Model.class);
        String json2 = JSON.toJSONString(model2);

        Assert.assertEquals(json, json2);
    }
}
