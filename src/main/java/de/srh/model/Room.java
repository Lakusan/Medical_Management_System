package de.srh.model;

public class Room {
    private int id;
    private String roomType;
    private int roomNumber;
    private int bedCount;
    private String responsibleNurse;
    private boolean isLocked;
    private int bedNumber;
    private boolean isAvailable;
    private boolean maintanance;

    public Room(int id,
                String roomType,
                int roomNumber,
                int bedCount,
                String responsibleNurse,
                boolean isLocked,
                int bedNumber,
                boolean isAvailable,
                boolean maintanance) {
        this.id = id;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.bedCount = bedCount;
        this.responsibleNurse = responsibleNurse;
        this.isLocked = isLocked;
        this.bedNumber = bedNumber;
        this.isAvailable = isAvailable;
        this.maintanance = maintanance;
    }

    public Room(String roomType,
                int roomNumber,
                int bedCount,
                String responsibleNurse,
                boolean isLocked,
                int bedNumber,
                boolean isAvailable,
                boolean maintanance) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.bedCount = bedCount;
        this.responsibleNurse = responsibleNurse;
        this.isLocked = isLocked;
        this.bedNumber = bedNumber;
        this.isAvailable = isAvailable;
        this.maintanance = maintanance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public String getResponsibleNurse() {
        return responsibleNurse;
    }

    public void setResponsibleNurse(String responsibleNurse) {
        this.responsibleNurse = responsibleNurse;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isMaintanance() {
        return maintanance;
    }

    public void setMaintanance(boolean maintanance) {
        this.maintanance = maintanance;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomType='" + roomType + '\'' +
                ", roomNumber=" + roomNumber +
                ", bedCount=" + bedCount +
                ", responsibleNurse='" + responsibleNurse + '\'' +
                ", isLocked=" + isLocked +
                ", bedNumber=" + bedNumber +
                ", isAvailable=" + isAvailable +
                ", maintanance=" + maintanance +
                '}';
    }
}
