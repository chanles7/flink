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

package org.apache.flink.table.connector;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.table.connector.source.abilities.SupportsRowLevelModificationScan;

/**
 * The context is intended to provide the relevant table scan information needed by the sink to
 * perform row-level update/delete. It'll be generated by a table source that implements {@link
 * SupportsRowLevelModificationScan}, and then passed to a sink which implements {@link
 * SupportsRowLevelUpdate} or {@link SupportsRowLevelDelete} for executing UPDATE/DELETE statement
 * during compilation phase.
 *
 * <p>This mechanism enables the coordination between the table sources and the table sink which is
 * to be updated/deleted.
 *
 * <p>Connectors can implement this interface to provide custom information.
 */
@PublicEvolving
public interface RowLevelModificationScanContext {}
