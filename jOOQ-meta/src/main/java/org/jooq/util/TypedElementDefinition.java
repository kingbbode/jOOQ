/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.util;

/**
 * An element that has a data type.
 *
 * @author Lukas Eder
 */
public interface TypedElementDefinition<T extends Definition> extends Definition {

    /**
     * The column / parameter / attribute type after applying forced types.
     */
    DataTypeDefinition getType();

    /**
     * The column / parameter type as declared in the database (prior to applying forced types).
     */
    DataTypeDefinition getDefinedType();

    /**
     * The container that contains this typed element.
     */
    T getContainer();
}
