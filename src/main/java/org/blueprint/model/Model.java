package org.blueprint.model;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Model extends ModelItem {

    private static final long serialVersionUID = -6606994624059449173L;

    @JSONField(ordinal = 11)
    private Long buildNumber;

    @JSONField(ordinal = 12)
    private List<Entity> entities;

    @JSONField(ordinal = 13)
    private List<Relation> relations;

    @JSONField(ordinal = 10)
    private String version;

    public void addEntity(Entity entity) {
        this.getEntities().add(entity);
        entity.setModelName(getName());
    }

    public void addRelation(Relation relation) {
        this.getRelations().add(relation);
    }

    public Long getBuildNumber() {
        return buildNumber;
    }

    public List<Entity> getEntities() {
        if (entities == null)
            entities = new ArrayList<Entity>();
        return entities;
    }

    public List<Relation> getRelations() {
        if (relations == null)
            relations = new ArrayList<Relation>();
        return relations;
    }

    public String getVersion() {
        return version;
    }

    public void setBuildNumber(Long buildNumber) {
        this.buildNumber = buildNumber;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
