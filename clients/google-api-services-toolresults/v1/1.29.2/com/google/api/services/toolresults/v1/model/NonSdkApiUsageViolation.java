/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.toolresults.v1.model;

/**
 * Additional details for a non-sdk API usage violation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NonSdkApiUsageViolation extends com.google.api.client.json.GenericJson {

  /**
   * Signatures of a subset of those hidden API's.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> apiSignatures;

  /**
   * Total number of unique hidden API's accessed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer uniqueApis;

  /**
   * Signatures of a subset of those hidden API's.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApiSignatures() {
    return apiSignatures;
  }

  /**
   * Signatures of a subset of those hidden API's.
   * @param apiSignatures apiSignatures or {@code null} for none
   */
  public NonSdkApiUsageViolation setApiSignatures(java.util.List<java.lang.String> apiSignatures) {
    this.apiSignatures = apiSignatures;
    return this;
  }

  /**
   * Total number of unique hidden API's accessed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUniqueApis() {
    return uniqueApis;
  }

  /**
   * Total number of unique hidden API's accessed.
   * @param uniqueApis uniqueApis or {@code null} for none
   */
  public NonSdkApiUsageViolation setUniqueApis(java.lang.Integer uniqueApis) {
    this.uniqueApis = uniqueApis;
    return this;
  }

  @Override
  public NonSdkApiUsageViolation set(String fieldName, Object value) {
    return (NonSdkApiUsageViolation) super.set(fieldName, value);
  }

  @Override
  public NonSdkApiUsageViolation clone() {
    return (NonSdkApiUsageViolation) super.clone();
  }

}
