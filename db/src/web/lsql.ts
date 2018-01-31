export namespace com_lsql_demo_db_schema_public {
    export interface Person {
        firstName: string;
        lastName: string;
        id: number;
    }
}

export namespace com_lsql_demo_db_schema_public {
    export interface Flyway_Schema_History {
        executionTime: number;
        installedOn: any;
        installedRank: number;
        success: boolean;
        checksum?: number;
        description: string;
        installedBy: string;
        type: string;
        version?: string;
        script: string;
    }
}

export namespace com_lsql_demo_db_personstmts {
    export interface LoadPersonById {
        id: number;
        firstName: string;
        lastName: string;
    }
}

