/**
 * Copyright 2013 Tommi S.E. Laukkanen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.addons.sitekit.site;

import java.util.List;

/**
 * The view version.
 * @author Tommi S.E. Laukkanen
 */
public final class ViewVersion {
    /** The view version number. */
    private int version;
    /** The parent view name. */
    private String masterViewName;
    /** The view title. */
    private String title;
    /** The view keywords. */
    private String keywords;
    /** The view description. */
    private String description;
    /** The view window class. */
    private String windowClass;
    /** The view viewer roles. */
    private String[] viewerRoles;
    /** The view viewlet descriptors. */
    private List<ViewletDescriptor> viewletDescriptors;

    /**
     * Constructor for populating view version with proper values.
     * @param version The view version number.
     * @param masterViewName The name of the parent view or null.
     * @param title The view title.
     * @param keywords The view keywords.
     * @param description The view description.
     * @param viewClass The view window class.
     * @param viewerRoles The view viewer roles.
     * @param viewletDescriptors The view descriptors.
     */
    public ViewVersion(final int version, final String masterViewName,
                       final String title, final String keywords, final String description,
                       final String viewClass, final String[] viewerRoles,
                       final List<ViewletDescriptor> viewletDescriptors) {
        super();
        this.version = version;
        this.masterViewName = masterViewName;
        this.title = title;
        this.keywords = keywords;
        this.description = description;
        this.windowClass = viewClass;
        this.viewerRoles = viewerRoles;
        this.viewletDescriptors = viewletDescriptors;
    }

    /**
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(final int version) {
        this.version = version;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the masterViewName
     */
    public String getMasterViewName() {
        return masterViewName;
    }

    /**
     * @param masterViewName the masterViewName to set
     */
    public void setMasterViewName(final String masterViewName) {
        this.masterViewName = masterViewName;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(final String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * @return the windowClass
     */
    public String getWindowClass() {
        return windowClass;
    }

    /**
     * @param windowClass the windowClass to set
     */
    public void setWindowClass(final String windowClass) {
        this.windowClass = windowClass;
    }

    /**
     * @return the viewerRoles
     */
    public String[] getViewerRoles() {
        return viewerRoles;
    }

    /**
     * @param viewerRoles the viewerRoles to set
     */
    public void setViewerRoles(final String[] viewerRoles) {
        this.viewerRoles = viewerRoles;
    }

    /**
     * @return the viewComponents
     */
    public List<ViewletDescriptor> getViewletDescriptors() {
        return viewletDescriptors;
    }

    /**
     * @param viewletDescriptors the widgets to set
     */
    public void setViewletDescriptors(final List<ViewletDescriptor> viewletDescriptors) {
        this.viewletDescriptors = viewletDescriptors;
    }


}