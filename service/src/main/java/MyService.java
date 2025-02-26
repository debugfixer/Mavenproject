package ru.netology.service;

import ru.netology.db.Db;
import ru.netology.db.DbSetting;
import ru.netology.db.MyEntity;

import java.util.UUID;

public class MyService {
    private DbSetting dbSetting = new DbSetting("name", "password");
    private Db db = new Db(dbSetting);

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}
