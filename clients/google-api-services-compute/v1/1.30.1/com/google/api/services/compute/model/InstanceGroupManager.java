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

package com.google.api.services.compute.model;

/**
 * Represents a Managed Instance Group resource.
 *
 * An instance group is a collection of VM instances that you can manage as a single entity. For
 * more information, read Instance groups.
 *
 * For zonal Managed Instance Group, use the instanceGroupManagers resource.
 *
 * For regional Managed Instance Group, use the regionInstanceGroupManagers resource. (==
 * resource_for {$api_version}.instanceGroupManagers ==) (== resource_for
 * {$api_version}.regionInstanceGroupManagers ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupManager extends com.google.api.client.json.GenericJson {

  /**
   * The autohealing policy for this managed instance group. You can specify only one value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceGroupManagerAutoHealingPolicy> autoHealingPolicies;

  /**
   * The base instance name to use for instances in this group. The value must be 1-58 characters
   * long. Instances are named by appending a hyphen and a random four-character string to the base
   * instance name. The base instance name must comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseInstanceName;

  /**
   * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * [Output Only] The list of instance actions and the number of instances in this managed instance
   * group that are scheduled for each of those actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupManagerActionsSummary currentActions;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Policy specifying intended distribution of instances in regional managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DistributionPolicy distributionPolicy;

  /**
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored
   * when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to
   * update the InstanceGroupManager, otherwise the request will fail with error 412
   * conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] The URL of the Instance Group resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceGroup;

  /**
   * The URL of the instance template that is specified for this managed instance group. The group
   * uses this template to create all new instances in the managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceTemplate;

  /**
   * [Output Only] The resource type, which is always compute#instanceGroupManager for managed
   * instance groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the managed instance group. The name must be 1-63 characters long, and comply with
   * RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NamedPort> namedPorts;

  /**
   * [Output Only] The URL of the region where the managed instance group resides (for regional
   * resources).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] The URL for this managed instance group. The server defines this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The status of this managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupManagerStatus status;

  /**
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added.
   * The target pools automatically apply to all of the instances in the managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetPools;

  /**
   * The target number of running instances for this managed instance group. You can reduce this
   * number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing
   * the group also changes this number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetSize;

  /**
   * The update policy for this managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupManagerUpdatePolicy updatePolicy;

  /**
   * Specifies the instance templates used by this managed instance group to create instances.
   *
   * Each version is defined by an instanceTemplate and a name. Every version can appear at most
   * once per instance group. This field overrides the top-level instanceTemplate field. Read more
   * about the relationships between these fields. Exactly one version must leave the targetSize
   * field unset. That version will be applied to all remaining instances. For more information,
   * read about canary updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceGroupManagerVersion> versions;

  /**
   * [Output Only] The URL of the zone where the managed instance group is located (for zonal
   * resources).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The autohealing policy for this managed instance group. You can specify only one value.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceGroupManagerAutoHealingPolicy> getAutoHealingPolicies() {
    return autoHealingPolicies;
  }

  /**
   * The autohealing policy for this managed instance group. You can specify only one value.
   * @param autoHealingPolicies autoHealingPolicies or {@code null} for none
   */
  public InstanceGroupManager setAutoHealingPolicies(java.util.List<InstanceGroupManagerAutoHealingPolicy> autoHealingPolicies) {
    this.autoHealingPolicies = autoHealingPolicies;
    return this;
  }

  /**
   * The base instance name to use for instances in this group. The value must be 1-58 characters
   * long. Instances are named by appending a hyphen and a random four-character string to the base
   * instance name. The base instance name must comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseInstanceName() {
    return baseInstanceName;
  }

  /**
   * The base instance name to use for instances in this group. The value must be 1-58 characters
   * long. Instances are named by appending a hyphen and a random four-character string to the base
   * instance name. The base instance name must comply with RFC1035.
   * @param baseInstanceName baseInstanceName or {@code null} for none
   */
  public InstanceGroupManager setBaseInstanceName(java.lang.String baseInstanceName) {
    this.baseInstanceName = baseInstanceName;
    return this;
  }

  /**
   * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] The creation timestamp for this managed instance group in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public InstanceGroupManager setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * [Output Only] The list of instance actions and the number of instances in this managed instance
   * group that are scheduled for each of those actions.
   * @return value or {@code null} for none
   */
  public InstanceGroupManagerActionsSummary getCurrentActions() {
    return currentActions;
  }

  /**
   * [Output Only] The list of instance actions and the number of instances in this managed instance
   * group that are scheduled for each of those actions.
   * @param currentActions currentActions or {@code null} for none
   */
  public InstanceGroupManager setCurrentActions(InstanceGroupManagerActionsSummary currentActions) {
    this.currentActions = currentActions;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public InstanceGroupManager setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Policy specifying intended distribution of instances in regional managed instance group.
   * @return value or {@code null} for none
   */
  public DistributionPolicy getDistributionPolicy() {
    return distributionPolicy;
  }

  /**
   * Policy specifying intended distribution of instances in regional managed instance group.
   * @param distributionPolicy distributionPolicy or {@code null} for none
   */
  public InstanceGroupManager setDistributionPolicy(DistributionPolicy distributionPolicy) {
    this.distributionPolicy = distributionPolicy;
    return this;
  }

  /**
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored
   * when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to
   * update the InstanceGroupManager, otherwise the request will fail with error 412
   * conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored
   * when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to
   * update the InstanceGroupManager, otherwise the request will fail with error 412
   * conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored
   * when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to
   * update the InstanceGroupManager, otherwise the request will fail with error 412
   * conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public InstanceGroupManager setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. This field may be used in optimistic locking. It will be ignored
   * when inserting an InstanceGroupManager. An up-to-date fingerprint must be provided in order to
   * update the InstanceGroupManager, otherwise the request will fail with error 412
   * conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an InstanceGroupManager.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public InstanceGroupManager encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] A unique identifier for this resource type. The server generates this identifier.
   * @param id id or {@code null} for none
   */
  public InstanceGroupManager setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] The URL of the Instance Group resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * [Output Only] The URL of the Instance Group resource.
   * @param instanceGroup instanceGroup or {@code null} for none
   */
  public InstanceGroupManager setInstanceGroup(java.lang.String instanceGroup) {
    this.instanceGroup = instanceGroup;
    return this;
  }

  /**
   * The URL of the instance template that is specified for this managed instance group. The group
   * uses this template to create all new instances in the managed instance group.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceTemplate() {
    return instanceTemplate;
  }

  /**
   * The URL of the instance template that is specified for this managed instance group. The group
   * uses this template to create all new instances in the managed instance group.
   * @param instanceTemplate instanceTemplate or {@code null} for none
   */
  public InstanceGroupManager setInstanceTemplate(java.lang.String instanceTemplate) {
    this.instanceTemplate = instanceTemplate;
    return this;
  }

  /**
   * [Output Only] The resource type, which is always compute#instanceGroupManager for managed
   * instance groups.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The resource type, which is always compute#instanceGroupManager for managed
   * instance groups.
   * @param kind kind or {@code null} for none
   */
  public InstanceGroupManager setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the managed instance group. The name must be 1-63 characters long, and comply with
   * RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the managed instance group. The name must be 1-63 characters long, and comply with
   * RFC1035.
   * @param name name or {@code null} for none
   */
  public InstanceGroupManager setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
   * @return value or {@code null} for none
   */
  public java.util.List<NamedPort> getNamedPorts() {
    return namedPorts;
  }

  /**
   * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
   * @param namedPorts namedPorts or {@code null} for none
   */
  public InstanceGroupManager setNamedPorts(java.util.List<NamedPort> namedPorts) {
    this.namedPorts = namedPorts;
    return this;
  }

  /**
   * [Output Only] The URL of the region where the managed instance group resides (for regional
   * resources).
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] The URL of the region where the managed instance group resides (for regional
   * resources).
   * @param region region or {@code null} for none
   */
  public InstanceGroupManager setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] The URL for this managed instance group. The server defines this URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] The URL for this managed instance group. The server defines this URL.
   * @param selfLink selfLink or {@code null} for none
   */
  public InstanceGroupManager setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The status of this managed instance group.
   * @return value or {@code null} for none
   */
  public InstanceGroupManagerStatus getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of this managed instance group.
   * @param status status or {@code null} for none
   */
  public InstanceGroupManager setStatus(InstanceGroupManagerStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added.
   * The target pools automatically apply to all of the instances in the managed instance group.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetPools() {
    return targetPools;
  }

  /**
   * The URLs for all TargetPool resources to which instances in the instanceGroup field are added.
   * The target pools automatically apply to all of the instances in the managed instance group.
   * @param targetPools targetPools or {@code null} for none
   */
  public InstanceGroupManager setTargetPools(java.util.List<java.lang.String> targetPools) {
    this.targetPools = targetPools;
    return this;
  }

  /**
   * The target number of running instances for this managed instance group. You can reduce this
   * number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing
   * the group also changes this number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetSize() {
    return targetSize;
  }

  /**
   * The target number of running instances for this managed instance group. You can reduce this
   * number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing
   * the group also changes this number.
   * @param targetSize targetSize or {@code null} for none
   */
  public InstanceGroupManager setTargetSize(java.lang.Integer targetSize) {
    this.targetSize = targetSize;
    return this;
  }

  /**
   * The update policy for this managed instance group.
   * @return value or {@code null} for none
   */
  public InstanceGroupManagerUpdatePolicy getUpdatePolicy() {
    return updatePolicy;
  }

  /**
   * The update policy for this managed instance group.
   * @param updatePolicy updatePolicy or {@code null} for none
   */
  public InstanceGroupManager setUpdatePolicy(InstanceGroupManagerUpdatePolicy updatePolicy) {
    this.updatePolicy = updatePolicy;
    return this;
  }

  /**
   * Specifies the instance templates used by this managed instance group to create instances.
   *
   * Each version is defined by an instanceTemplate and a name. Every version can appear at most
   * once per instance group. This field overrides the top-level instanceTemplate field. Read more
   * about the relationships between these fields. Exactly one version must leave the targetSize
   * field unset. That version will be applied to all remaining instances. For more information,
   * read about canary updates.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceGroupManagerVersion> getVersions() {
    return versions;
  }

  /**
   * Specifies the instance templates used by this managed instance group to create instances.
   *
   * Each version is defined by an instanceTemplate and a name. Every version can appear at most
   * once per instance group. This field overrides the top-level instanceTemplate field. Read more
   * about the relationships between these fields. Exactly one version must leave the targetSize
   * field unset. That version will be applied to all remaining instances. For more information,
   * read about canary updates.
   * @param versions versions or {@code null} for none
   */
  public InstanceGroupManager setVersions(java.util.List<InstanceGroupManagerVersion> versions) {
    this.versions = versions;
    return this;
  }

  /**
   * [Output Only] The URL of the zone where the managed instance group is located (for zonal
   * resources).
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The URL of the zone where the managed instance group is located (for zonal
   * resources).
   * @param zone zone or {@code null} for none
   */
  public InstanceGroupManager setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public InstanceGroupManager set(String fieldName, Object value) {
    return (InstanceGroupManager) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupManager clone() {
    return (InstanceGroupManager) super.clone();
  }

}
