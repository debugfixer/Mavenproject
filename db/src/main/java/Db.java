package ru.netology.db;

import java.util.UUID;

public class Db {
    private ru.netology.db.DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        this.myEntity = new MyEntity("first");
        this.myEntity.setId(UUID.randomUUID());
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }
}
