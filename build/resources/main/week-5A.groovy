databaseChangeLog = {

    changeSet(author: "brooney (generated)", id: "1462247189090-1") {
        createTable(tableName: "quote") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "quotePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "text", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}
