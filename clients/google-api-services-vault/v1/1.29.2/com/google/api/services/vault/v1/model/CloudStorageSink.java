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

package com.google.api.services.vault.v1.model;

/**
 * Export sink for cloud storage files.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudStorageSink extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The exported files on cloud storage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CloudStorageFile> files;

  static {
    // hack to force ProGuard to consider CloudStorageFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CloudStorageFile.class);
  }

  /**
   * Output only. The exported files on cloud storage.
   * @return value or {@code null} for none
   */
  public java.util.List<CloudStorageFile> getFiles() {
    return files;
  }

  /**
   * Output only. The exported files on cloud storage.
   * @param files files or {@code null} for none
   */
  public CloudStorageSink setFiles(java.util.List<CloudStorageFile> files) {
    this.files = files;
    return this;
  }

  @Override
  public CloudStorageSink set(String fieldName, Object value) {
    return (CloudStorageSink) super.set(fieldName, value);
  }

  @Override
  public CloudStorageSink clone() {
    return (CloudStorageSink) super.clone();
  }

}
