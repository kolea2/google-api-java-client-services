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

package com.google.api.services.drive.model;

/**
 * Information about the user, the user's Drive, and system capabilities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class About extends com.google.api.client.json.GenericJson {

  /**
   * Whether the user has installed the requesting app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean appInstalled;

  /**
   * Whether the user can create Team Drives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canCreateTeamDrives;

  /**
   * A map of source MIME type to possible targets for all supported exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.List<java.lang.String>> exportFormats;

  /**
   * The currently supported folder colors as RGB hex strings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> folderColorPalette;

  /**
   * A map of source MIME type to possible targets for all supported imports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.List<java.lang.String>> importFormats;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#about".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A map of maximum import sizes by MIME type, in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.Map<String, java.lang.Long> maxImportSizes;

  /**
   * The maximum upload size in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxUploadSize;

  /**
   * The user's storage quota limits and usage. All fields are measured in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageQuota storageQuota;

  /**
   * A list of themes that are supported for Team Drives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TeamDriveThemes> teamDriveThemes;

  static {
    // hack to force ProGuard to consider TeamDriveThemes used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TeamDriveThemes.class);
  }

  /**
   * The authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * Whether the user has installed the requesting app.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAppInstalled() {
    return appInstalled;
  }

  /**
   * Whether the user has installed the requesting app.
   * @param appInstalled appInstalled or {@code null} for none
   */
  public About setAppInstalled(java.lang.Boolean appInstalled) {
    this.appInstalled = appInstalled;
    return this;
  }

  /**
   * Whether the user can create Team Drives.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanCreateTeamDrives() {
    return canCreateTeamDrives;
  }

  /**
   * Whether the user can create Team Drives.
   * @param canCreateTeamDrives canCreateTeamDrives or {@code null} for none
   */
  public About setCanCreateTeamDrives(java.lang.Boolean canCreateTeamDrives) {
    this.canCreateTeamDrives = canCreateTeamDrives;
    return this;
  }

  /**
   * A map of source MIME type to possible targets for all supported exports.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.List<java.lang.String>> getExportFormats() {
    return exportFormats;
  }

  /**
   * A map of source MIME type to possible targets for all supported exports.
   * @param exportFormats exportFormats or {@code null} for none
   */
  public About setExportFormats(java.util.Map<String, java.util.List<java.lang.String>> exportFormats) {
    this.exportFormats = exportFormats;
    return this;
  }

  /**
   * The currently supported folder colors as RGB hex strings.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFolderColorPalette() {
    return folderColorPalette;
  }

  /**
   * The currently supported folder colors as RGB hex strings.
   * @param folderColorPalette folderColorPalette or {@code null} for none
   */
  public About setFolderColorPalette(java.util.List<java.lang.String> folderColorPalette) {
    this.folderColorPalette = folderColorPalette;
    return this;
  }

  /**
   * A map of source MIME type to possible targets for all supported imports.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.List<java.lang.String>> getImportFormats() {
    return importFormats;
  }

  /**
   * A map of source MIME type to possible targets for all supported imports.
   * @param importFormats importFormats or {@code null} for none
   */
  public About setImportFormats(java.util.Map<String, java.util.List<java.lang.String>> importFormats) {
    this.importFormats = importFormats;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#about".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "drive#about".
   * @param kind kind or {@code null} for none
   */
  public About setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A map of maximum import sizes by MIME type, in bytes.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Long> getMaxImportSizes() {
    return maxImportSizes;
  }

  /**
   * A map of maximum import sizes by MIME type, in bytes.
   * @param maxImportSizes maxImportSizes or {@code null} for none
   */
  public About setMaxImportSizes(java.util.Map<String, java.lang.Long> maxImportSizes) {
    this.maxImportSizes = maxImportSizes;
    return this;
  }

  /**
   * The maximum upload size in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxUploadSize() {
    return maxUploadSize;
  }

  /**
   * The maximum upload size in bytes.
   * @param maxUploadSize maxUploadSize or {@code null} for none
   */
  public About setMaxUploadSize(java.lang.Long maxUploadSize) {
    this.maxUploadSize = maxUploadSize;
    return this;
  }

  /**
   * The user's storage quota limits and usage. All fields are measured in bytes.
   * @return value or {@code null} for none
   */
  public StorageQuota getStorageQuota() {
    return storageQuota;
  }

  /**
   * The user's storage quota limits and usage. All fields are measured in bytes.
   * @param storageQuota storageQuota or {@code null} for none
   */
  public About setStorageQuota(StorageQuota storageQuota) {
    this.storageQuota = storageQuota;
    return this;
  }

  /**
   * A list of themes that are supported for Team Drives.
   * @return value or {@code null} for none
   */
  public java.util.List<TeamDriveThemes> getTeamDriveThemes() {
    return teamDriveThemes;
  }

  /**
   * A list of themes that are supported for Team Drives.
   * @param teamDriveThemes teamDriveThemes or {@code null} for none
   */
  public About setTeamDriveThemes(java.util.List<TeamDriveThemes> teamDriveThemes) {
    this.teamDriveThemes = teamDriveThemes;
    return this;
  }

  /**
   * The authenticated user.
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * The authenticated user.
   * @param user user or {@code null} for none
   */
  public About setUser(User user) {
    this.user = user;
    return this;
  }

  @Override
  public About set(String fieldName, Object value) {
    return (About) super.set(fieldName, value);
  }

  @Override
  public About clone() {
    return (About) super.clone();
  }

  /**
   * The user's storage quota limits and usage. All fields are measured in bytes.
   */
  public static final class StorageQuota extends com.google.api.client.json.GenericJson {

    /**
     * The usage limit, if applicable. This will not be present if the user has unlimited storage.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long limit;

    /**
     * The total usage across all services.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long usage;

    /**
     * The usage by all files in Google Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long usageInDrive;

    /**
     * The usage by trashed files in Google Drive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long usageInDriveTrash;

    /**
     * The usage limit, if applicable. This will not be present if the user has unlimited storage.
     * @return value or {@code null} for none
     */
    public java.lang.Long getLimit() {
      return limit;
    }

    /**
     * The usage limit, if applicable. This will not be present if the user has unlimited storage.
     * @param limit limit or {@code null} for none
     */
    public StorageQuota setLimit(java.lang.Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * The total usage across all services.
     * @return value or {@code null} for none
     */
    public java.lang.Long getUsage() {
      return usage;
    }

    /**
     * The total usage across all services.
     * @param usage usage or {@code null} for none
     */
    public StorageQuota setUsage(java.lang.Long usage) {
      this.usage = usage;
      return this;
    }

    /**
     * The usage by all files in Google Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Long getUsageInDrive() {
      return usageInDrive;
    }

    /**
     * The usage by all files in Google Drive.
     * @param usageInDrive usageInDrive or {@code null} for none
     */
    public StorageQuota setUsageInDrive(java.lang.Long usageInDrive) {
      this.usageInDrive = usageInDrive;
      return this;
    }

    /**
     * The usage by trashed files in Google Drive.
     * @return value or {@code null} for none
     */
    public java.lang.Long getUsageInDriveTrash() {
      return usageInDriveTrash;
    }

    /**
     * The usage by trashed files in Google Drive.
     * @param usageInDriveTrash usageInDriveTrash or {@code null} for none
     */
    public StorageQuota setUsageInDriveTrash(java.lang.Long usageInDriveTrash) {
      this.usageInDriveTrash = usageInDriveTrash;
      return this;
    }

    @Override
    public StorageQuota set(String fieldName, Object value) {
      return (StorageQuota) super.set(fieldName, value);
    }

    @Override
    public StorageQuota clone() {
      return (StorageQuota) super.clone();
    }

  }

  /**
   * Model definition for AboutTeamDriveThemes.
   */
  public static final class TeamDriveThemes extends com.google.api.client.json.GenericJson {

    /**
     * A link to this Team Drive theme's background image.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String backgroundImageLink;

    /**
     * The color of this Team Drive theme as an RGB hex string.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String colorRgb;

    /**
     * The ID of the theme.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * A link to this Team Drive theme's background image.
     * @return value or {@code null} for none
     */
    public java.lang.String getBackgroundImageLink() {
      return backgroundImageLink;
    }

    /**
     * A link to this Team Drive theme's background image.
     * @param backgroundImageLink backgroundImageLink or {@code null} for none
     */
    public TeamDriveThemes setBackgroundImageLink(java.lang.String backgroundImageLink) {
      this.backgroundImageLink = backgroundImageLink;
      return this;
    }

    /**
     * The color of this Team Drive theme as an RGB hex string.
     * @return value or {@code null} for none
     */
    public java.lang.String getColorRgb() {
      return colorRgb;
    }

    /**
     * The color of this Team Drive theme as an RGB hex string.
     * @param colorRgb colorRgb or {@code null} for none
     */
    public TeamDriveThemes setColorRgb(java.lang.String colorRgb) {
      this.colorRgb = colorRgb;
      return this;
    }

    /**
     * The ID of the theme.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The ID of the theme.
     * @param id id or {@code null} for none
     */
    public TeamDriveThemes setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public TeamDriveThemes set(String fieldName, Object value) {
      return (TeamDriveThemes) super.set(fieldName, value);
    }

    @Override
    public TeamDriveThemes clone() {
      return (TeamDriveThemes) super.clone();
    }

  }

}
