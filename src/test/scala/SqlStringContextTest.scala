import utest._
import groodi._

object SqlStringContextTest extends TestSuite {

//  implicit val connection = new Connection {override def commit(): Unit = ???
//
//    override def getHoldability: Int = ???
//
//    override def setCatalog(catalog: String): Unit = ???
//
//    override def setHoldability(holdability: Int): Unit = ???
//
//    override def prepareStatement(sql: String): PreparedStatement = {
//      new PreparedStatement {override def setShort(parameterIndex: Int, x: Short): Unit = ???
//
//        override def setObject(parameterIndex: Int, x: scala.Any, targetSqlType: Int): Unit = ()
//
//        override def setObject(parameterIndex: Int, x: scala.Any): Unit = ()
//
//        override def setObject(parameterIndex: Int, x: scala.Any, targetSqlType: Int, scaleOrLength: Int): Unit = ()
//
//        override def setDouble(parameterIndex: Int, x: Double): Unit = ???
//
//        override def setNClob(parameterIndex: Int, value: NClob): Unit = ???
//
//        override def setNClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???
//
//        override def setNClob(parameterIndex: Int, reader: Reader): Unit = ???
//
//        override def getParameterMetaData: ParameterMetaData = ???
//
//        override def setTime(parameterIndex: Int, x: Time): Unit = ???
//
//        override def setTime(parameterIndex: Int, x: Time, cal: Calendar): Unit = ???
//
//        override def setUnicodeStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???
//
//        override def addBatch(): Unit = ???
//
//        override def execute(): Boolean = ???
//
//        override def executeQuery(): ResultSet = new ResultSet {override def getByte(columnIndex: Int): Byte = ???
//
//          override def getByte(columnLabel: String): Byte = ???
//
//          override def getBigDecimal(columnIndex: Int, scale: Int): java.math.BigDecimal = ???
//
//          override def getBigDecimal(columnLabel: String, scale: Int): java.math.BigDecimal = ???
//
//          override def getBigDecimal(columnIndex: Int): java.math.BigDecimal = ???
//
//          override def getBigDecimal(columnLabel: String): java.math.BigDecimal = ???
//
//          override def getClob(columnIndex: Int): Clob = ???
//
//          override def getClob(columnLabel: String): Clob = ???
//
//          override def getAsciiStream(columnIndex: Int): InputStream = ???
//
//          override def getAsciiStream(columnLabel: String): InputStream = ???
//
//          override def updateShort(columnIndex: Int, x: Short): Unit = ???
//
//          override def updateShort(columnLabel: String, x: Short): Unit = ???
//
//          override def isFirst: Boolean = ???
//
//          override def wasNull(): Boolean = ???
//
//          override def updateBytes(columnIndex: Int, x: Array[Byte]): Unit = ???
//
//          override def updateBytes(columnLabel: String, x: Array[Byte]): Unit = ???
//
//          override def getNString(columnIndex: Int): String = ???
//
//          override def getNString(columnLabel: String): String = ???
//
//          override def getNClob(columnIndex: Int): NClob = ???
//
//          override def getNClob(columnLabel: String): NClob = ???
//
//          override def getObject(columnIndex: Int): AnyRef = ???
//
//          override def getObject(columnLabel: String): AnyRef = ???
//
//          override def getObject(columnIndex: Int, map: util.Map[String, Class[_]]): AnyRef = ???
//
//          override def getObject(columnLabel: String, map: util.Map[String, Class[_]]): AnyRef = ???
//
//          override def getObject[T](columnIndex: Int, `type`: Class[T]): T = ???
//
//          override def getObject[T](columnLabel: String, `type`: Class[T]): T = ???
//
//          override def updateByte(columnIndex: Int, x: Byte): Unit = ???
//
//          override def updateByte(columnLabel: String, x: Byte): Unit = ???
//
//          override def beforeFirst(): Unit = ???
//
//          override def getRow: Int = ???
//
//          override def afterLast(): Unit = ???
//
//          override def refreshRow(): Unit = ???
//
//          override def updateClob(columnIndex: Int, x: Clob): Unit = ???
//
//          override def updateClob(columnLabel: String, x: Clob): Unit = ???
//
//          override def updateClob(columnIndex: Int, reader: Reader, length: Long): Unit = ???
//
//          override def updateClob(columnLabel: String, reader: Reader, length: Long): Unit = ???
//
//          override def updateClob(columnIndex: Int, reader: Reader): Unit = ???
//
//          override def updateClob(columnLabel: String, reader: Reader): Unit = ???
//
//          override def getInt(columnIndex: Int): Int = ???
//
//          override def getInt(columnLabel: String): Int = ???
//
//          override def getType: Int = ???
//
//          override def updateArray(columnIndex: Int, x: javasql.Array): Unit = ???
//
//          override def updateArray(columnLabel: String, x: javasql.Array): Unit = ???
//
//          override def getMetaData: ResultSetMetaData = ???
//
//          override def relative(rows: Int): Boolean = ???
//
//          override def updateDate(columnIndex: Int, x: Date): Unit = ???
//
//          override def updateDate(columnLabel: String, x: Date): Unit = ???
//
//          override def getNCharacterStream(columnIndex: Int): Reader = ???
//
//          override def getNCharacterStream(columnLabel: String): Reader = ???
//
//          override def isLast: Boolean = ???
//
//          override def getWarnings: SQLWarning = ???
//
//          override def updateObject(columnIndex: Int, x: scala.Any, scaleOrLength: Int): Unit = ???
//
//          override def updateObject(columnIndex: Int, x: scala.Any): Unit = ???
//
//          override def updateObject(columnLabel: String, x: scala.Any, scaleOrLength: Int): Unit = ???
//
//          override def updateObject(columnLabel: String, x: scala.Any): Unit = ???
//
//          override def updateBlob(columnIndex: Int, x: Blob): Unit = ???
//
//          override def updateBlob(columnLabel: String, x: Blob): Unit = ???
//
//          override def updateBlob(columnIndex: Int, inputStream: InputStream, length: Long): Unit = ???
//
//          override def updateBlob(columnLabel: String, inputStream: InputStream, length: Long): Unit = ???
//
//          override def updateBlob(columnIndex: Int, inputStream: InputStream): Unit = ???
//
//          override def updateBlob(columnLabel: String, inputStream: InputStream): Unit = ???
//
//          override def updateRowId(columnIndex: Int, x: RowId): Unit = ???
//
//          override def updateRowId(columnLabel: String, x: RowId): Unit = ???
//
//          override def getDate(columnIndex: Int): Date = ???
//
//          override def getDate(columnLabel: String): Date = ???
//
//          override def getDate(columnIndex: Int, cal: Calendar): Date = ???
//
//          override def getDate(columnLabel: String, cal: Calendar): Date = ???
//
//          override def getBoolean(columnIndex: Int): Boolean = ???
//
//          override def getBoolean(columnLabel: String): Boolean = ???
//
//          override def close(): Unit = ???
//
//          override def updateSQLXML(columnIndex: Int, xmlObject: SQLXML): Unit = ???
//
//          override def updateSQLXML(columnLabel: String, xmlObject: SQLXML): Unit = ???
//
//          override def moveToCurrentRow(): Unit = ???
//
//          override def setFetchSize(rows: Int): Unit = ???
//
//          override def updateTime(columnIndex: Int, x: Time): Unit = ???
//
//          override def updateTime(columnLabel: String, x: Time): Unit = ???
//
//          override def clearWarnings(): Unit = ???
//
//          override def getCharacterStream(columnIndex: Int): Reader = ???
//
//          override def getCharacterStream(columnLabel: String): Reader = ???
//
//          override def updateTimestamp(columnIndex: Int, x: Timestamp): Unit = ???
//
//          override def updateTimestamp(columnLabel: String, x: Timestamp): Unit = ???
//
//          override def getBlob(columnIndex: Int): Blob = ???
//
//          override def getBlob(columnLabel: String): Blob = ???
//
//          override def rowDeleted(): Boolean = ???
//
//          override def getLong(columnIndex: Int): Long = ???
//
//          override def getLong(columnLabel: String): Long = ???
//
//          override def isAfterLast: Boolean = ???
//
//          override def insertRow(): Unit = ???
//
//          override def isClosed: Boolean = ???
//
//          override def absolute(row: Int): Boolean = ???
//
//          override def getUnicodeStream(columnIndex: Int): InputStream = ???
//
//          override def getUnicodeStream(columnLabel: String): InputStream = ???
//
//          override def updateFloat(columnIndex: Int, x: Float): Unit = ???
//
//          override def updateFloat(columnLabel: String, x: Float): Unit = ???
//
//          override def first(): Boolean = ???
//
//          override def updateRow(): Unit = ???
//
//          override def getCursorName: String = ???
//
//          override def getHoldability: Int = ???
//
//          override def getArray(columnIndex: Int): javasql.Array = ???
//
//          override def getArray(columnLabel: String): javasql.Array = ???
//
//          override def updateNClob(columnIndex: Int, nClob: NClob): Unit = ???
//
//          override def updateNClob(columnLabel: String, nClob: NClob): Unit = ???
//
//          override def updateNClob(columnIndex: Int, reader: Reader, length: Long): Unit = ???
//
//          override def updateNClob(columnLabel: String, reader: Reader, length: Long): Unit = ???
//
//          override def updateNClob(columnIndex: Int, reader: Reader): Unit = ???
//
//          override def updateNClob(columnLabel: String, reader: Reader): Unit = ???
//
//          override def getFetchSize: Int = ???
//
//          override def getConcurrency: Int = ???
//
//          override def getBytes(columnIndex: Int): Array[Byte] = ???
//
//          override def getBytes(columnLabel: String): Array[Byte] = ???
//
//          override def setFetchDirection(direction: Int): Unit = ???
//
//          override def updateAsciiStream(columnIndex: Int, x: InputStream, length: Int): Unit = ???
//
//          override def updateAsciiStream(columnLabel: String, x: InputStream, length: Int): Unit = ???
//
//          override def updateAsciiStream(columnIndex: Int, x: InputStream, length: Long): Unit = ???
//
//          override def updateAsciiStream(columnLabel: String, x: InputStream, length: Long): Unit = ???
//
//          override def updateAsciiStream(columnIndex: Int, x: InputStream): Unit = ???
//
//          override def updateAsciiStream(columnLabel: String, x: InputStream): Unit = ???
//
//          override def cancelRowUpdates(): Unit = ???
//
//          override def getStatement: Statement = ???
//
//          override def getFetchDirection: Int = ???
//
//          override def last(): Boolean = ???
//
//          override def updateNull(columnIndex: Int): Unit = ???
//
//          override def updateNull(columnLabel: String): Unit = ???
//
//          override def isBeforeFirst: Boolean = ???
//
//          override def updateBoolean(columnIndex: Int, x: Boolean): Unit = ???
//
//          override def updateBoolean(columnLabel: String, x: Boolean): Unit = ???
//
//          override def getURL(columnIndex: Int): URL = ???
//
//          override def getURL(columnLabel: String): URL = ???
//
//          override def deleteRow(): Unit = ???
//
//          override def getSQLXML(columnIndex: Int): SQLXML = ???
//
//          override def getSQLXML(columnLabel: String): SQLXML = ???
//
//          override def updateBigDecimal(columnIndex: Int, x: java.math.BigDecimal): Unit = ???
//
//          override def updateBigDecimal(columnLabel: String, x: java.math.BigDecimal): Unit = ???
//
//          override def rowInserted(): Boolean = ???
//
//          override def updateInt(columnIndex: Int, x: Int): Unit = ???
//
//          override def updateInt(columnLabel: String, x: Int): Unit = ???
//
//          override def updateLong(columnIndex: Int, x: Long): Unit = ???
//
//          override def updateLong(columnLabel: String, x: Long): Unit = ???
//
//          override def next(): Boolean = ???
//
//          override def getTime(columnIndex: Int): Time = ???
//
//          override def getTime(columnLabel: String): Time = ???
//
//          override def getTime(columnIndex: Int, cal: Calendar): Time = ???
//
//          override def getTime(columnLabel: String, cal: Calendar): Time = ???
//
//          override def getBinaryStream(columnIndex: Int): InputStream = ???
//
//          override def getBinaryStream(columnLabel: String): InputStream = ???
//
//          override def getRowId(columnIndex: Int): RowId = ???
//
//          override def getRowId(columnLabel: String): RowId = ???
//
//          override def findColumn(columnLabel: String): Int = ???
//
//          override def getDouble(columnIndex: Int): Double = ???
//
//          override def getDouble(columnLabel: String): Double = ???
//
//          override def rowUpdated(): Boolean = ???
//
//          override def getFloat(columnIndex: Int): Float = ???
//
//          override def getFloat(columnLabel: String): Float = ???
//
//          override def updateString(columnIndex: Int, x: String): Unit = ???
//
//          override def updateString(columnLabel: String, x: String): Unit = ???
//
//          override def getRef(columnIndex: Int): Ref = ???
//
//          override def getRef(columnLabel: String): Ref = ???
//
//          override def getTimestamp(columnIndex: Int): Timestamp = ???
//
//          override def getTimestamp(columnLabel: String): Timestamp = ???
//
//          override def getTimestamp(columnIndex: Int, cal: Calendar): Timestamp = ???
//
//          override def getTimestamp(columnLabel: String, cal: Calendar): Timestamp = ???
//
//          override def updateRef(columnIndex: Int, x: Ref): Unit = ???
//
//          override def updateRef(columnLabel: String, x: Ref): Unit = ???
//
//          override def previous(): Boolean = ???
//
//          override def getShort(columnIndex: Int): Short = ???
//
//          override def getShort(columnLabel: String): Short = ???
//
//          override def moveToInsertRow(): Unit = ???
//
//          override def getString(columnIndex: Int): String = ???
//
//          override def getString(columnLabel: String): String = ???
//
//          override def updateNString(columnIndex: Int, nString: String): Unit = ???
//
//          override def updateNString(columnLabel: String, nString: String): Unit = ???
//
//          override def updateDouble(columnIndex: Int, x: Double): Unit = ???
//
//          override def updateDouble(columnLabel: String, x: Double): Unit = ???
//
//          override def updateNCharacterStream(columnIndex: Int, x: Reader, length: Long): Unit = ???
//
//          override def updateNCharacterStream(columnLabel: String, reader: Reader, length: Long): Unit = ???
//
//          override def updateNCharacterStream(columnIndex: Int, x: Reader): Unit = ???
//
//          override def updateNCharacterStream(columnLabel: String, reader: Reader): Unit = ???
//
//          override def updateCharacterStream(columnIndex: Int, x: Reader, length: Int): Unit = ???
//
//          override def updateCharacterStream(columnLabel: String, reader: Reader, length: Int): Unit = ???
//
//          override def updateCharacterStream(columnIndex: Int, x: Reader, length: Long): Unit = ???
//
//          override def updateCharacterStream(columnLabel: String, reader: Reader, length: Long): Unit = ???
//
//          override def updateCharacterStream(columnIndex: Int, x: Reader): Unit = ???
//
//          override def updateCharacterStream(columnLabel: String, reader: Reader): Unit = ???
//
//          override def updateBinaryStream(columnIndex: Int, x: InputStream, length: Int): Unit = ???
//
//          override def updateBinaryStream(columnLabel: String, x: InputStream, length: Int): Unit = ???
//
//          override def updateBinaryStream(columnIndex: Int, x: InputStream, length: Long): Unit = ???
//
//          override def updateBinaryStream(columnLabel: String, x: InputStream, length: Long): Unit = ???
//
//          override def updateBinaryStream(columnIndex: Int, x: InputStream): Unit = ???
//
//          override def updateBinaryStream(columnLabel: String, x: InputStream): Unit = ???
//
//          override def unwrap[T](iface: Class[T]): T = ???
//
//          override def isWrapperFor(iface: Class[_]): Boolean = ???
//        }
//
//        override def setArray(parameterIndex: Int, x: javasql.Array): Unit = ???
//
//        override def setURL(parameterIndex: Int, x: URL): Unit = ???
//
//        override def setInt(parameterIndex: Int, x: Int): Unit = ()
//
//        override def setString(parameterIndex: Int, x: String): Unit = ()
//
//        override def setLong(parameterIndex: Int, x: Long): Unit = ???
//
//        override def setAsciiStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???
//
//        override def setAsciiStream(parameterIndex: Int, x: InputStream, length: Long): Unit = ???
//
//        override def setAsciiStream(parameterIndex: Int, x: InputStream): Unit = ???
//
//        override def setClob(parameterIndex: Int, x: Clob): Unit = ???
//
//        override def setClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???
//
//        override def setClob(parameterIndex: Int, reader: Reader): Unit = ???
//
//        override def setBinaryStream(parameterIndex: Int, x: InputStream, length: Int): Unit = ???
//
//        override def setBinaryStream(parameterIndex: Int, x: InputStream, length: Long): Unit = ???
//
//        override def setBinaryStream(parameterIndex: Int, x: InputStream): Unit = ???
//
//        override def setNString(parameterIndex: Int, value: String): Unit = ???
//
//        override def getMetaData: ResultSetMetaData = ???
//
//        override def executeUpdate(): Int = ???
//
//        override def setByte(parameterIndex: Int, x: Byte): Unit = ???
//
//        override def setNull(parameterIndex: Int, sqlType: Int): Unit = ???
//
//        override def setNull(parameterIndex: Int, sqlType: Int, typeName: String): Unit = ???
//
//        override def setSQLXML(parameterIndex: Int, xmlObject: SQLXML): Unit = ???
//
//        override def setNCharacterStream(parameterIndex: Int, value: Reader, length: Long): Unit = ???
//
//        override def setNCharacterStream(parameterIndex: Int, value: Reader): Unit = ???
//
//        override def setCharacterStream(parameterIndex: Int, reader: Reader, length: Int): Unit = ???
//
//        override def setCharacterStream(parameterIndex: Int, reader: Reader, length: Long): Unit = ???
//
//        override def setCharacterStream(parameterIndex: Int, reader: Reader): Unit = ???
//
//        override def setRef(parameterIndex: Int, x: Ref): Unit = ???
//
//        override def setBlob(parameterIndex: Int, x: Blob): Unit = ???
//
//        override def setBlob(parameterIndex: Int, inputStream: InputStream, length: Long): Unit = ???
//
//        override def setBlob(parameterIndex: Int, inputStream: InputStream): Unit = ???
//
//        override def setTimestamp(parameterIndex: Int, x: Timestamp): Unit = ???
//
//        override def setTimestamp(parameterIndex: Int, x: Timestamp, cal: Calendar): Unit = ???
//
//        override def setBytes(parameterIndex: Int, x: Array[Byte]): Unit = ???
//
//        override def setBigDecimal(parameterIndex: Int, x: java.math.BigDecimal): Unit = ???
//
//        override def setFloat(parameterIndex: Int, x: Float): Unit = ()
//
//        override def setRowId(parameterIndex: Int, x: RowId): Unit = ???
//
//        override def setDate(parameterIndex: Int, x: Date): Unit = ???
//
//        override def setDate(parameterIndex: Int, x: Date, cal: Calendar): Unit = ???
//
//        override def clearParameters(): Unit = ???
//
//        override def setBoolean(parameterIndex: Int, x: Boolean): Unit = ???
//
//        override def cancel(): Unit = ???
//
//        override def getResultSetHoldability: Int = ???
//
//        override def getMaxFieldSize: Int = ???
//
//        override def getUpdateCount: Int = ???
//
//        override def setPoolable(poolable: Boolean): Unit = ???
//
//        override def getFetchSize: Int = ???
//
//        override def setQueryTimeout(seconds: Int): Unit = ???
//
//        override def setFetchDirection(direction: Int): Unit = ???
//
//        override def setMaxRows(max: Int): Unit = ???
//
//        override def setCursorName(name: String): Unit = ???
//
//        override def getFetchDirection: Int = ???
//
//        override def getResultSetType: Int = ???
//
//        override def getMoreResults: Boolean = ???
//
//        override def getMoreResults(current: Int): Boolean = ???
//
//        override def addBatch(sql: String): Unit = ???
//
//        override def execute(sql: String): Boolean = ???
//
//        override def execute(sql: String, autoGeneratedKeys: Int): Boolean = ???
//
//        override def execute(sql: String, columnIndexes: Array[Int]): Boolean = ???
//
//        override def execute(sql: String, columnNames: Array[String]): Boolean = ???
//
//        override def executeQuery(sql: String): ResultSet = ???
//
//        override def isCloseOnCompletion: Boolean = ???
//
//        override def getResultSet: ResultSet = ???
//
//        override def getMaxRows: Int = ???
//
//        override def setEscapeProcessing(enable: Boolean): Unit = ???
//
//        override def executeUpdate(sql: String): Int = ???
//
//        override def executeUpdate(sql: String, autoGeneratedKeys: Int): Int = ???
//
//        override def executeUpdate(sql: String, columnIndexes: Array[Int]): Int = ???
//
//        override def executeUpdate(sql: String, columnNames: Array[String]): Int = ???
//
//        override def getQueryTimeout: Int = ???
//
//        override def getWarnings: SQLWarning = ???
//
//        override def getConnection: Connection = ???
//
//        override def setMaxFieldSize(max: Int): Unit = ???
//
//        override def isPoolable: Boolean = ???
//
//        override def clearBatch(): Unit = ???
//
//        override def close(): Unit = ???
//
//        override def closeOnCompletion(): Unit = ???
//
//        override def executeBatch(): Array[Int] = ???
//
//        override def getGeneratedKeys: ResultSet = ???
//
//        override def setFetchSize(rows: Int): Unit = ???
//
//        override def clearWarnings(): Unit = ???
//
//        override def getResultSetConcurrency: Int = ???
//
//        override def isClosed: Boolean = ???
//
//        override def unwrap[T](iface: Class[T]): T = ???
//
//        override def isWrapperFor(iface: Class[_]): Boolean = ???
//      }
//    }
//
//    override def prepareStatement(sql: String, resultSetType: Int, resultSetConcurrency: Int): PreparedStatement = ???
//
//    override def prepareStatement(sql: String, resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): PreparedStatement = ???
//
//    override def prepareStatement(sql: String, autoGeneratedKeys: Int): PreparedStatement = ???
//
//    override def prepareStatement(sql: String, columnIndexes: Array[Int]): PreparedStatement = ???
//
//    override def prepareStatement(sql: String, columnNames: Array[String]): PreparedStatement = ???
//
//    override def createClob(): Clob = ???
//
//    override def setSchema(schema: String): Unit = ???
//
//    override def setClientInfo(name: String, value: String): Unit = ???
//
//    override def setClientInfo(properties: Properties): Unit = ???
//
//    override def createSQLXML(): SQLXML = ???
//
//    override def getCatalog: String = ???
//
//    override def createBlob(): Blob = ???
//
//    override def createStatement(): Statement = ???
//
//    override def createStatement(resultSetType: Int, resultSetConcurrency: Int): Statement = ???
//
//    override def createStatement(resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): Statement = ???
//
//    override def abort(executor: Executor): Unit = ???
//
//    override def setAutoCommit(autoCommit: Boolean): Unit = ???
//
//    override def getMetaData: DatabaseMetaData = ???
//
//    override def setReadOnly(readOnly: Boolean): Unit = ???
//
//    override def prepareCall(sql: String): CallableStatement = ???
//
//    override def prepareCall(sql: String, resultSetType: Int, resultSetConcurrency: Int): CallableStatement = ???
//
//    override def prepareCall(sql: String, resultSetType: Int, resultSetConcurrency: Int, resultSetHoldability: Int): CallableStatement = ???
//
//    override def setTransactionIsolation(level: Int): Unit = ???
//
//    override def getWarnings: SQLWarning = ???
//
//    override def releaseSavepoint(savepoint: Savepoint): Unit = ???
//
//    override def nativeSQL(sql: String): String = ???
//
//    override def isReadOnly: Boolean = ???
//
//    override def createArrayOf(typeName: String, elements: Array[AnyRef]): javasql.Array = ???
//
//    override def setSavepoint(): Savepoint = ???
//
//    override def setSavepoint(name: String): Savepoint = ???
//
//    override def close(): Unit = ???
//
//    override def createNClob(): NClob = ???
//
//    override def rollback(): Unit = ???
//
//    override def rollback(savepoint: Savepoint): Unit = ???
//
//    override def setNetworkTimeout(executor: Executor, milliseconds: Int): Unit = ???
//
//    override def setTypeMap(map: util.Map[String, Class[_]]): Unit = ???
//
//    override def isValid(timeout: Int): Boolean = ???
//
//    override def getAutoCommit: Boolean = ???
//
//    override def clearWarnings(): Unit = ???
//
//    override def getSchema: String = ???
//
//    override def getNetworkTimeout: Int = ???
//
//    override def isClosed: Boolean = ???
//
//    override def getTransactionIsolation: Int = ???
//
//    override def createStruct(typeName: String, attributes: Array[AnyRef]): Struct = ???
//
//    override def getClientInfo(name: String): String = ???
//
//    override def getClientInfo: Properties = ???
//
//    override def getTypeMap: util.Map[String, Class[_]] = ???
//
//    override def unwrap[T](iface: Class[T]): T = ???
//
//    override def isWrapperFor(iface: Class[_]): Boolean = ???
//  }

  val tests = Tests {
    "should prepare statement right" - {
      val id = 0
      val statement = sql"select * from users where id = $id"
      assert(
        statement == PreparedStatement(
          Seq("select * from users where id = ", ""),
          Seq(SqlArgument.IntValue(0))
        )
      )
    }
  }
}
