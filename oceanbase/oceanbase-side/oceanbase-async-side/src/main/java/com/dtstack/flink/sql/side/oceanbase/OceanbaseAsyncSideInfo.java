/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dtstack.flink.sql.side.oceanbase;

import com.dtstack.flink.sql.side.AbstractSideTableInfo;
import com.dtstack.flink.sql.side.FieldInfo;
import com.dtstack.flink.sql.side.JoinInfo;
import com.dtstack.flink.sql.side.rdb.async.RdbAsyncSideInfo;
import org.apache.flink.api.java.typeutils.RowTypeInfo;

import java.util.List;

/**
 * @author : tiezhu
 * @date : 2020/3/26
 */
public class OceanbaseAsyncSideInfo extends RdbAsyncSideInfo {

    public OceanbaseAsyncSideInfo(RowTypeInfo rowTypeInfo,
                                  JoinInfo joinInfo,
                                  List<FieldInfo> outfieldsInfoList,
                                  AbstractSideTableInfo sideTableInfo){
        super(rowTypeInfo, joinInfo, outfieldsInfoList, sideTableInfo);
    }
}
