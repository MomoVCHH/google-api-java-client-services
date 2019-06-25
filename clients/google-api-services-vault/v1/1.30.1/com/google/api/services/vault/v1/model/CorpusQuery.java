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
 * Corpus specific queries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CorpusQuery extends com.google.api.client.json.GenericJson {

  /**
   * Details pertaining to Drive holds. If set, corpus must be Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HeldDriveQuery driveQuery;

  /**
   * Details pertaining to Groups holds. If set, corpus must be Groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HeldGroupsQuery groupsQuery;

  /**
   * Details pertaining to Hangouts Chat holds. If set, corpus must be Hangouts Chat.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HeldHangoutsChatQuery hangoutsChatQuery;

  /**
   * Details pertaining to mail holds. If set, corpus must be mail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HeldMailQuery mailQuery;

  /**
   * Details pertaining to Drive holds. If set, corpus must be Drive.
   * @return value or {@code null} for none
   */
  public HeldDriveQuery getDriveQuery() {
    return driveQuery;
  }

  /**
   * Details pertaining to Drive holds. If set, corpus must be Drive.
   * @param driveQuery driveQuery or {@code null} for none
   */
  public CorpusQuery setDriveQuery(HeldDriveQuery driveQuery) {
    this.driveQuery = driveQuery;
    return this;
  }

  /**
   * Details pertaining to Groups holds. If set, corpus must be Groups.
   * @return value or {@code null} for none
   */
  public HeldGroupsQuery getGroupsQuery() {
    return groupsQuery;
  }

  /**
   * Details pertaining to Groups holds. If set, corpus must be Groups.
   * @param groupsQuery groupsQuery or {@code null} for none
   */
  public CorpusQuery setGroupsQuery(HeldGroupsQuery groupsQuery) {
    this.groupsQuery = groupsQuery;
    return this;
  }

  /**
   * Details pertaining to Hangouts Chat holds. If set, corpus must be Hangouts Chat.
   * @return value or {@code null} for none
   */
  public HeldHangoutsChatQuery getHangoutsChatQuery() {
    return hangoutsChatQuery;
  }

  /**
   * Details pertaining to Hangouts Chat holds. If set, corpus must be Hangouts Chat.
   * @param hangoutsChatQuery hangoutsChatQuery or {@code null} for none
   */
  public CorpusQuery setHangoutsChatQuery(HeldHangoutsChatQuery hangoutsChatQuery) {
    this.hangoutsChatQuery = hangoutsChatQuery;
    return this;
  }

  /**
   * Details pertaining to mail holds. If set, corpus must be mail.
   * @return value or {@code null} for none
   */
  public HeldMailQuery getMailQuery() {
    return mailQuery;
  }

  /**
   * Details pertaining to mail holds. If set, corpus must be mail.
   * @param mailQuery mailQuery or {@code null} for none
   */
  public CorpusQuery setMailQuery(HeldMailQuery mailQuery) {
    this.mailQuery = mailQuery;
    return this;
  }

  @Override
  public CorpusQuery set(String fieldName, Object value) {
    return (CorpusQuery) super.set(fieldName, value);
  }

  @Override
  public CorpusQuery clone() {
    return (CorpusQuery) super.clone();
  }

}
