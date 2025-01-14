/** ******************************************************************************
 * Copyright (c) 2021 Precies. Software and others
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 * ****************************************************************************** */
package org.eclipse.openvsx.dto;

public class ExtensionDTO {

    private final long id;
    private final String publicId;
    private final String name;
    private final NamespaceDTO namespace;
    private final Double averageRating;
    private final int downloadCount;

    public ExtensionDTO(
            long id,
            String publicId,
            String name,
            Double averageRating,
            int downloadCount,
            long namespaceId,
            String namespacePublicId,
            String namespaceName
    ) {
        this.id = id;
        this.publicId = publicId;
        this.name = name;
        this.averageRating = averageRating;
        this.downloadCount = downloadCount;

        this.namespace = new NamespaceDTO(namespaceId, namespacePublicId, namespaceName);
    }

    public long getId() {
        return id;
    }

    public String getPublicId() {
        return publicId;
    }

    public String getName() {
        return name;
    }

    public NamespaceDTO getNamespace() {
        return namespace;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public int getDownloadCount() {
        return downloadCount;
    }
}
