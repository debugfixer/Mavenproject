package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.db.Db;
import ru.netology.db.DbSetting;
import ru.netology.db.MyEntity;

import java.util.UUID;

class MyServiceTest {

    @Test
    void testGetMyEntity_initialState_success() {
        // given
        MyService myService = new MyService();

        // when
        MyEntity myEntity = myService.getMyEntity();

        // then
        Assertions.assertNotNull(myEntity);
        Assertions.assertEquals("first", myEntity.getName());
        Assertions.assertNotNull(myEntity.getId());
    }

    @Test
    void testSetMyEntity_updatesEntity_success() {
        // given
        MyService myService = new MyService();
        MyEntity newEntity = new MyEntity("second");

        // when
        MyEntity updatedEntity = myService.setMyEntity(newEntity);

        // then
        Assertions.assertEquals("second", updatedEntity.getName());
        Assertions.assertNotNull(updatedEntity.getId());
    }

    @Test
    void testDbSetting_initialization_success() {
        // given
        DbSetting dbSetting = new DbSetting("admin", "1234");
        Db db = new Db(dbSetting);

        // when
        DbSetting retrievedSetting = db.getDbSetting();

        // then
        Assertions.assertNotNull(retrievedSetting);
        Assertions.assertEquals("admin", retrievedSetting.getName());
        Assertions.assertEquals("1234", retrievedSetting.getPassword());
    }
}
