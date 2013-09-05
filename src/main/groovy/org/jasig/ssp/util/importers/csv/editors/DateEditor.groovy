/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.ssp.util.importers.csv.editors

import org.apache.commons.lang.StringUtils 
import java.text.SimpleDateFormat

class DateEditor implements Editor{

    SimpleDateFormat  format;

    DateEditor(SimpleDateFormat format){
        this.format = format;
    }

    DateEditor(String formatAsString){
        this.format = new SimpleDateFormat(formatAsString);
    }


    def fromText(String value) {
		if(StringUtils.isNotBlank(value))
        	return format.parse(value)
		return null
    }
}