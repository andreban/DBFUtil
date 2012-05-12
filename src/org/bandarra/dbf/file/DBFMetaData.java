/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bandarra.dbf.file;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andre.bandarra
 */
public class DBFMetaData {
    private Map<String, DBFField> fields = new HashMap<String, DBFField>();
    private Date lastUpdate;
    private int numberOfRecords;
    private short bytesInHeader;
    private short bytesInRecord;

    DBFMetaData() {
    }
    
    public Date getLastUpdate() {
        return lastUpdate;
    }

    void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getNumberOfRecords() {
        return numberOfRecords;
    }

    void setNumberOfRecords(int numberOfRecords) {
        this.numberOfRecords = numberOfRecords;
    }

    public short getBytesInHeader() {
        return bytesInHeader;
    }

    void setBytesInHeader(short bytesInHeader) {
        this.bytesInHeader = bytesInHeader;
    }

    public short getBytesInRecord() {
        return bytesInRecord;
    }

    void setBytesInRecord(short bytesInRecord) {
        this.bytesInRecord = bytesInRecord;
    }

    public Map<String, DBFField> getFields() {
        return fields;
    }

    void setFields(Map<String, DBFField> fields) {
        this.fields = fields;
    }
    

    
    

}
