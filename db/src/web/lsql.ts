export namespace com_lsql_demo_db_schema_public {
    export interface Flyway_Schema_HistoryRow {
        installedBy: string;
        success: boolean;
        checksum?: number;
        description: string;
        installedOn: any;
        type: string;
        version?: string;
        script: string;
        installedRank: number;
        executionTime: number;
    }
}

export namespace com_lsql_demo_db_schema_public {
    export interface Flyway_Schema_HistoryMap {
        installed_by: string;
        success: boolean;
        checksum?: number;
        description: string;
        installed_on: any;
        type: string;
        version?: string;
        script: string;
        installed_rank: number;
        execution_time: number;
    }
}

export namespace com_lsql_demo_db_schema_public {
    export interface PersonRow {
        lastName: string;
        id: number;
        firstName: string;
        age?: number;
    }
}

export namespace com_lsql_demo_db_schema_public {
    export interface PersonMap {
        last_name: string;
        id: number;
        first_name: string;
        age?: number;
    }
}

export namespace com_lsql_demo_db_com_lsql_demo_personstmts {
    export interface LoadAverageAgeByLastNameRow {
        lastName: string;
        age: number;
    }
}

export namespace com_lsql_demo_db_com_lsql_demo_personstmts {
    export interface LoadAverageAgeByLastNameMap {
        last_name: string;
        age: number;
    }
}

export namespace com_lsql_demo_db_com_lsql_demo_personstmts {
    export interface LoadPersonByIdRow {
        id: number;
        firstName: string;
        lastName: string;
        age?: number;
    }
}

export namespace com_lsql_demo_db_com_lsql_demo_personstmts {
    export interface LoadPersonByIdMap {
        id: number;
        first_name: string;
        last_name: string;
        age?: number;
    }
}

