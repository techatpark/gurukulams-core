module my.module {
    requires java.base;
    requires java.sql;
    requires java.naming;
    requires org.json;
    requires org.postgresql.jdbc;
    requires jakarta.validation;

    opens com.gurukulams.core.service;
    opens com.gurukulams.core.payload;
}