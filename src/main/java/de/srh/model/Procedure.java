package de.srh.model;

public class Procedure {
    int procedureId;
    String procedureName;

    float price;

    public Procedure(int procedureId, String procedureName, float price) {
        this.procedureId = procedureId;
        this.procedureName = procedureName;
        this.price = price;
    }

    public Procedure(String procedureName, float price) {
        this.procedureName = procedureName;
        this.price = price;
    }

    public Procedure(String procedureName) {
        this.procedureName = procedureName;
    }

    public int getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(int procedureId) {
        this.procedureId = procedureId;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "procedureId=" + procedureId +
                ", procedureName='" + procedureName + '\'' +
                ", price=" + price +
                '}';
    }
}
