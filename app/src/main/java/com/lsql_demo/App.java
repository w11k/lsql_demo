package com.lsql_demo;

import com.lsql_demo.db.PersonStmts;
import com.lsql_demo.db.personstmts.LoadAverageAgeByLastName;
import com.lsql_demo.db.personstmts.LoadPersonById;
import com.lsql_demo.db.schema_public.Person_Row;
import com.lsql_demo.db.schema_public.Person_Table;

import javax.inject.Inject;
import java.util.List;

public final class App {

    private final Person_Table personTable;
    private final PersonStmts personStmts;

    @Inject
    public App(Person_Table personTable, PersonStmts personStmts) {
        this.personTable = personTable;
        this.personStmts = personStmts;
    }

    public void run() {
        personTable.insert(new Person_Row()
                .withFirstName("Max")
                .withLastName("Power")
                .withAge((int) (Math.random() * 100)));

        List<LoadPersonById> loadPersonById = personStmts.loadPersonById()
                .withId(1)
                .toList();

        System.out.println("loadPersonById = " + loadPersonById);

        List<LoadAverageAgeByLastName> powerAvgAge = personStmts.loadAverageAgeByLastName()
                .withLastName("Power")
                .toList();

        System.out.println("powerAvgAge = " + powerAvgAge);
    }

}
