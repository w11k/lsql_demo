package com.lsql_demo;

import com.google.common.base.Optional;
import com.lsql_demo.db.TestDto;
import com.lsql_demo.db.com.lsql_demo.PersonStmts;
import com.lsql_demo.db.com.lsql_demo.personstmts.LoadAverageAgeByLastName;
import com.lsql_demo.db.com.lsql_demo.personstmts.LoadPersonById;
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

    /**
     * dto: TestDto
     * - firstName: string
     * - lastName: string
     */
    public void run() {
        personTable.insert(new Person_Row()
                .withFirstName("Max")
                .withLastName("Power")
                .withAge(50));

        personTable.insert(new Person_Row()
                .withFirstName("Max")
                .withLastName("Power")
                .withAge(60));

        Optional<LoadPersonById> loadPersonById = personStmts.loadPersonById()
                .withId(1)
                .first();

        System.out.println("loadPersonById = " + loadPersonById);

        List<LoadAverageAgeByLastName> powerAvgAge = personStmts.loadAverageAgeByLastName()
                .withLastName("Power")
                .toList();

        System.out.println("powerAvgAge = " + powerAvgAge);

        TestDto testDto = TestDto.from(loadPersonById.get());
        System.out.println("testDto = " + testDto);
    }

}
