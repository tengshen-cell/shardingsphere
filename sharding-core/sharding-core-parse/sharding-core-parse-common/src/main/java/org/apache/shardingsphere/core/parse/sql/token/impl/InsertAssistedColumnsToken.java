/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.sql.token.impl;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.apache.shardingsphere.core.parse.sql.token.Attachable;
import org.apache.shardingsphere.core.parse.sql.token.SQLToken;

import java.util.Collection;

/**
 * Insert assisted columns token.
 *
 * @author panjuan
 */
@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public final class InsertAssistedColumnsToken extends SQLToken implements Attachable {
    
    private final Collection<String> columns;
    
    private final boolean isToAddCloseParenthesis;
    
    public InsertAssistedColumnsToken(final int startIndex, final Collection<String> columns, final boolean isToAddCloseParenthesis) {
        super(startIndex);
        this.columns = columns;
        this.isToAddCloseParenthesis = isToAddCloseParenthesis;
    }
}
