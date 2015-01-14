package org.blueprint.model;

public class Relation extends ModelItem {

    private static final long serialVersionUID = -3205946814927557180L;

    private Type source;

    private Type target;

    private RelationType type;

    public Type getSource() {
        return source;
    }

    public Type getTarget() {
        return target;
    }

    public RelationType getType() {
        return type;
    }

    public void setSource(Type source) {
        this.source = source;
    }

    public void setTarget(Type target) {
        this.target = target;
    }

    public void setType(RelationType type) {
        this.type = type;
    }

}
