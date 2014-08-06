/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.server.core.uri.validator;

import org.apache.olingo.server.api.ODataTranslatedException;

public class UriValidationException extends ODataTranslatedException {

  private static final long serialVersionUID = -3179078078053564742L;

  public static enum MessageKeys implements MessageKey {
    /** parameter: unsupported query option */
    UNSUPPORTED_QUERY_OPTION,
    /** parameter: unsupported uri kind */
    UNSUPPORTED_URI_KIND,
    /** parameter: unsupported uri resource kind */
    UNSUPPORTED_URI_RESOURCE_KIND,
    /** parameter: unsupported function return type */
    UNSUPPORTED_FUNCTION_RETURN_TYPE,
    /** parameter: unsupported action return type */
    UNSUPPORTED_ACTION_RETURN_TYPE,
    /** parameter: unsupported http method */
    UNSUPPORTED_HTTP_METHOD,
    /** parameter: system query option */
    SYSTEM_QUERY_OPTION_NOT_ALLOWED,
    /** parameters: system query option, http method */
    SYSTEM_QUERY_OPTION_NOT_ALLOWED_FOR_HTTP_METHOD,
    /** parameter: invalid key property */
    INVALID_KEY_PROPERTY,
    /** parameter: untyped segment name */
    LAST_SEGMENT_NOT_TYPED,
    /** parameter: untyped segment name */
    SECOND_LAST_SEGMENT_NOT_TYPED,
    /** parameter: unallowed kind before $value */
    UNALLOWED_KIND_BEFORE_VALUE,
    /** parameter: unallowed kind before $count */
    UNALLOWED_KIND_BEFORE_COUNT,
  }
  
  public UriValidationException(String developmentMessage, MessageKey messageKey, String... parameters) {
    super(developmentMessage, messageKey, parameters);
  }

  public UriValidationException(String developmentMessage, Throwable cause, MessageKey messageKey,
      String... parameters) {
    super(developmentMessage, cause, messageKey, parameters);
  }
}
