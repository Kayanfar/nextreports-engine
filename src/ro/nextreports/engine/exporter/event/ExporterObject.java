/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.engine.exporter.event;

import java.io.Serializable;
//
// Created by IntelliJ IDEA.
// User: mihai.panaitescu
// Date: 27-Aug-2009
// Time: 13:50:11

//
public class ExporterObject implements Serializable {

    private int row;
    private int rowCount;

    public ExporterObject(int row, int rowCount) {
        this.row = row;
        this.rowCount = rowCount;
    }

    public int getRecord() {
        return row;
    }

    public void setRecord(int row) {
        this.row = row;
    }

    public int getRecordCount() {
        return rowCount;
    }

    public void setRecordCount(int rowCount) {
        this.rowCount = rowCount;
    }
}
