package org.parcore.domain;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * PAR API
 * <p>
 * FileFormat
 * <p>
 * Domain model for the FileFormat Core Entity
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * This class is based on code auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */
@ApiModel(description = "A file format as defined by PRONOM")
public class FileFormat {
    @SerializedName("puid")
    private String puid = null;

    @SerializedName("puidNamespace")
    private String puidNamespace = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("version")
    private String version = null;

    @SerializedName("aliases")
    private List<String> aliases = null;

    @SerializedName("families")
    private List<String> families = null;

    @SerializedName("types")
    private List<String> types = null;

    @SerializedName("disclosure")
    private String disclosure = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("binaryFileFormat")
    private String binaryFileFormat = null;

    @SerializedName("byteOrders")
    private List<String> byteOrders = null;

    @SerializedName("releaseDate")
    private String releaseDate = null;

    @SerializedName("withdrawnDate")
    private String withdrawnDate = null;

    @SerializedName("provenance")
    private ProvenanceInformation provenance = null;

    @SerializedName("lastUpdatedDate")
    private String lastUpdatedDate = null;

    @SerializedName("note")
    private String note = null;

    @SerializedName("risk")
    private String risk = null;

    @SerializedName("technicalEnvironment")
    private String technicalEnvironment = null;

    @SerializedName("identifiers")
    private List<IdentifierInformation> identifiers = null;

    @SerializedName("developers")
    private List<DeveloperInformation> developers = null;

    @SerializedName("documents")
    private List<DocumentInformation> documents = null;

    @SerializedName("externalSignatures")
    private List<ExternalSignatureInformation> externalSignatures = null;

    @SerializedName("internalSignatures")
    private List<InternalSignatureInformation> internalSignatures = null;

    @SerializedName("relatedFormats")
    private List<RelatedFormatInformation> relatedFormats = null;

    @SerializedName("droidSignatureFileVersion")
    private String droidSignatureFileVersion = null;

    @SerializedName("droidContainerFileVersion")
    private String droidContainerFileVersion = null;

    @SerializedName("localLastModifiedDate")
    private String localLastModifiedDate = null;


    public FileFormat puid(String puid) {
        this.puid = puid;
        return this;
    }

    /**
     * Persistent Unique Identifier, e.g. fmt/40, x-fmt/192
     *
     * @return puid
     **/
    @ApiModelProperty(required = true, value = "Persistent Unique Identifier, e.g. fmt/40, x-fmt/192")
    public String getPuid() {
        return puid;
    }

    public void setPuid(String puid) {
        this.puid = puid;
    }

    public FileFormat puidNamespace(String puidNamespace) {
        this.puidNamespace = puidNamespace;
        return this;
    }

    /**
     * Identifier for the publisher/issuer of the PUID, e.g. http://www.nationalarchives.gov.uk/
     *
     * @return puidNamespace
     **/
    @ApiModelProperty(required = true, value = "Identifier for the publisher/issuer of the PUID, e.g. http://www.nationalarchives.gov.uk/")
    public String getPuidNamespace() {
        return puidNamespace;
    }

    public void setPuidNamespace(String puidNamespace) {
        this.puidNamespace = puidNamespace;
    }

    public FileFormat name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileFormat version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public FileFormat aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public FileFormat addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<String>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Get aliases
     *
     * @return aliases
     **/
    @ApiModelProperty(value = "")
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public FileFormat families(List<String> families) {
        this.families = families;
        return this;
    }

    public FileFormat addFamiliesItem(String familiesItem) {
        if (this.families == null) {
            this.families = new ArrayList<String>();
        }
        this.families.add(familiesItem);
        return this;
    }

    /**
     * Get families
     *
     * @return families
     **/
    @ApiModelProperty(value = "")
    public List<String> getFamilies() {
        return families;
    }

    public void setFamilies(List<String> families) {
        this.families = families;
    }

    public FileFormat types(List<String> types) {
        this.types = types;
        return this;
    }

    public FileFormat addTypesItem(String typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<String>();
        }
        this.types.add(typesItem);
        return this;
    }

    /**
     * Get types
     *
     * @return types
     **/
    @ApiModelProperty(value = "")
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public FileFormat disclosure(String disclosure) {
        this.disclosure = disclosure;
        return this;
    }

    /**
     * Get disclosure
     *
     * @return disclosure
     **/
    @ApiModelProperty(value = "")
    public String getDisclosure() {
        return disclosure;
    }

    public void setDisclosure(String disclosure) {
        this.disclosure = disclosure;
    }

    public FileFormat description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FileFormat binaryFileFormat(String binaryFileFormat) {
        this.binaryFileFormat = binaryFileFormat;
        return this;
    }

    /**
     * Get binaryFileFormat
     *
     * @return binaryFileFormat
     **/
    @ApiModelProperty(value = "")
    public String getBinaryFileFormat() {
        return binaryFileFormat;
    }

    public void setBinaryFileFormat(String binaryFileFormat) {
        this.binaryFileFormat = binaryFileFormat;
    }

    public FileFormat byteOrders(List<String> byteOrders) {
        this.byteOrders = byteOrders;
        return this;
    }

    public FileFormat addByteOrdersItem(String byteOrdersItem) {
        if (this.byteOrders == null) {
            this.byteOrders = new ArrayList<String>();
        }
        this.byteOrders.add(byteOrdersItem);
        return this;
    }

    /**
     * Get byteOrders
     *
     * @return byteOrders
     **/
    @ApiModelProperty(value = "")
    public List<String> getByteOrders() {
        return byteOrders;
    }

    public void setByteOrders(List<String> byteOrders) {
        this.byteOrders = byteOrders;
    }

    public FileFormat releaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Get releaseDate
     *
     * @return releaseDate
     **/
    @ApiModelProperty(value = "")
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public FileFormat withdrawnDate(String withdrawnDate) {
        this.withdrawnDate = withdrawnDate;
        return this;
    }

    /**
     * Get withdrawnDate
     *
     * @return withdrawnDate
     **/
    @ApiModelProperty(value = "")
    public String getWithdrawnDate() {
        return withdrawnDate;
    }

    public void setWithdrawnDate(String withdrawnDate) {
        this.withdrawnDate = withdrawnDate;
    }

    public FileFormat provenance(ProvenanceInformation provenance) {
        this.provenance = provenance;
        return this;
    }

    /**
     * Get provenance
     *
     * @return provenance
     **/
    @ApiModelProperty(value = "")
    public ProvenanceInformation getProvenance() {
        return provenance;
    }

    public void setProvenance(ProvenanceInformation provenance) {
        this.provenance = provenance;
    }

    public FileFormat lastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    /**
     * Get lastUpdatedDate
     *
     * @return lastUpdatedDate
     **/
    @ApiModelProperty(value = "")
    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public FileFormat note(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     *
     * @return note
     **/
    @ApiModelProperty(value = "")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public FileFormat risk(String risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     **/
    @ApiModelProperty(value = "")
    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    public FileFormat technicalEnvironment(String technicalEnvironment) {
        this.technicalEnvironment = technicalEnvironment;
        return this;
    }

    /**
     * Get technicalEnvironment
     *
     * @return technicalEnvironment
     **/
    @ApiModelProperty(value = "")
    public String getTechnicalEnvironment() {
        return technicalEnvironment;
    }

    public void setTechnicalEnvironment(String technicalEnvironment) {
        this.technicalEnvironment = technicalEnvironment;
    }

    public FileFormat identifiers(List<IdentifierInformation> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public FileFormat addIdentifiersItem(IdentifierInformation identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<IdentifierInformation>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    /**
     * Get identifiers
     *
     * @return identifiers
     **/
    @ApiModelProperty(value = "")
    public List<IdentifierInformation> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<IdentifierInformation> identifiers) {
        this.identifiers = identifiers;
    }

    public FileFormat developers(List<DeveloperInformation> developers) {
        this.developers = developers;
        return this;
    }

    public FileFormat addDevelopersItem(DeveloperInformation developersItem) {
        if (this.developers == null) {
            this.developers = new ArrayList<DeveloperInformation>();
        }
        this.developers.add(developersItem);
        return this;
    }

    /**
     * Get developers
     *
     * @return developers
     **/
    @ApiModelProperty(value = "")
    public List<DeveloperInformation> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<DeveloperInformation> developers) {
        this.developers = developers;
    }

    public FileFormat documents(List<DocumentInformation> documents) {
        this.documents = documents;
        return this;
    }

    public FileFormat addDocumentsItem(DocumentInformation documentsItem) {
        if (this.documents == null) {
            this.documents = new ArrayList<DocumentInformation>();
        }
        this.documents.add(documentsItem);
        return this;
    }

    /**
     * Get documents
     *
     * @return documents
     **/
    @ApiModelProperty(value = "")
    public List<DocumentInformation> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentInformation> documents) {
        this.documents = documents;
    }

    public FileFormat externalSignatures(List<ExternalSignatureInformation> externalSignatures) {
        this.externalSignatures = externalSignatures;
        return this;
    }

    public FileFormat addExternalSignaturesItem(ExternalSignatureInformation externalSignaturesItem) {
        if (this.externalSignatures == null) {
            this.externalSignatures = new ArrayList<ExternalSignatureInformation>();
        }
        this.externalSignatures.add(externalSignaturesItem);
        return this;
    }

    /**
     * Get externalSignatures
     *
     * @return externalSignatures
     **/
    @ApiModelProperty(value = "")
    public List<ExternalSignatureInformation> getExternalSignatures() {
        return externalSignatures;
    }

    public void setExternalSignatures(List<ExternalSignatureInformation> externalSignatures) {
        this.externalSignatures = externalSignatures;
    }

    public FileFormat internalSignatures(List<InternalSignatureInformation> internalSignatures) {
        this.internalSignatures = internalSignatures;
        return this;
    }

    public FileFormat addInternalSignaturesItem(InternalSignatureInformation internalSignaturesItem) {
        if (this.internalSignatures == null) {
            this.internalSignatures = new ArrayList<InternalSignatureInformation>();
        }
        this.internalSignatures.add(internalSignaturesItem);
        return this;
    }

    /**
     * Get internalSignatures
     *
     * @return internalSignatures
     **/
    @ApiModelProperty(value = "")
    public List<InternalSignatureInformation> getInternalSignatures() {
        return internalSignatures;
    }

    public void setInternalSignatures(List<InternalSignatureInformation> internalSignatures) {
        this.internalSignatures = internalSignatures;
    }

    public FileFormat relatedFormats(List<RelatedFormatInformation> relatedFormats) {
        this.relatedFormats = relatedFormats;
        return this;
    }

    public FileFormat addRelatedFormatsItem(RelatedFormatInformation relatedFormatsItem) {
        if (this.relatedFormats == null) {
            this.relatedFormats = new ArrayList<RelatedFormatInformation>();
        }
        this.relatedFormats.add(relatedFormatsItem);
        return this;
    }

    /**
     * Get relatedFormats
     *
     * @return relatedFormats
     **/
    @ApiModelProperty(value = "")
    public List<RelatedFormatInformation> getRelatedFormats() {
        return relatedFormats;
    }

    public void setRelatedFormats(List<RelatedFormatInformation> relatedFormats) {
        this.relatedFormats = relatedFormats;
    }

    public FileFormat droidSignatureFileVersion(String droidSignatureFileVersion) {
        this.droidSignatureFileVersion = droidSignatureFileVersion;
        return this;
    }

    /**
     * Get droidSignatureFileVersion
     *
     * @return droidSignatureFileVersion
     **/
    @ApiModelProperty(value = "")
    public String getDroidSignatureFileVersion() {
        return droidSignatureFileVersion;
    }

    public void setDroidSignatureFileVersion(String droidSignatureFileVersion) {
        this.droidSignatureFileVersion = droidSignatureFileVersion;
    }

    public FileFormat droidContainerFileVersion(String droidContainerFileVersion) {
        this.droidContainerFileVersion = droidContainerFileVersion;
        return this;
    }

    /**
     * Get droidContainerFileVersion
     *
     * @return droidContainerFileVersion
     **/
    @ApiModelProperty(value = "")
    public String getDroidContainerFileVersion() {
        return droidContainerFileVersion;
    }

    public void setDroidContainerFileVersion(String droidContainerFileVersion) {
        this.droidContainerFileVersion = droidContainerFileVersion;
    }

    public FileFormat localLastModifiedDate(String localLastModifiedDate) {
        this.localLastModifiedDate = localLastModifiedDate;
        return this;
    }

    /**
     * Get localLastModifiedDate
     *
     * @return localLastModifiedDate
     **/
    @ApiModelProperty(value = "")
    public String getLocalLastModifiedDate() {
        return localLastModifiedDate;
    }

    public void setLocalLastModifiedDate(String localLastModifiedDate) {
        this.localLastModifiedDate = localLastModifiedDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileFormat fileFormat = (FileFormat) o;
        return Objects.equals(this.puid, fileFormat.puid) &&
                Objects.equals(this.puidNamespace, fileFormat.puidNamespace) &&
                Objects.equals(this.name, fileFormat.name) &&
                Objects.equals(this.version, fileFormat.version) &&
                Objects.equals(this.aliases, fileFormat.aliases) &&
                Objects.equals(this.families, fileFormat.families) &&
                Objects.equals(this.types, fileFormat.types) &&
                Objects.equals(this.disclosure, fileFormat.disclosure) &&
                Objects.equals(this.description, fileFormat.description) &&
                Objects.equals(this.binaryFileFormat, fileFormat.binaryFileFormat) &&
                Objects.equals(this.byteOrders, fileFormat.byteOrders) &&
                Objects.equals(this.releaseDate, fileFormat.releaseDate) &&
                Objects.equals(this.withdrawnDate, fileFormat.withdrawnDate) &&
                Objects.equals(this.provenance, fileFormat.provenance) &&
                Objects.equals(this.lastUpdatedDate, fileFormat.lastUpdatedDate) &&
                Objects.equals(this.note, fileFormat.note) &&
                Objects.equals(this.risk, fileFormat.risk) &&
                Objects.equals(this.technicalEnvironment, fileFormat.technicalEnvironment) &&
                Objects.equals(this.identifiers, fileFormat.identifiers) &&
                Objects.equals(this.developers, fileFormat.developers) &&
                Objects.equals(this.documents, fileFormat.documents) &&
                Objects.equals(this.externalSignatures, fileFormat.externalSignatures) &&
                Objects.equals(this.internalSignatures, fileFormat.internalSignatures) &&
                Objects.equals(this.relatedFormats, fileFormat.relatedFormats) &&
                Objects.equals(this.droidSignatureFileVersion, fileFormat.droidSignatureFileVersion) &&
                Objects.equals(this.droidContainerFileVersion, fileFormat.droidContainerFileVersion) &&
                Objects.equals(this.localLastModifiedDate, fileFormat.localLastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(puid, puidNamespace, name, version, aliases, families, types, disclosure, description, binaryFileFormat, byteOrders, releaseDate, withdrawnDate, provenance, lastUpdatedDate, note, risk, technicalEnvironment, identifiers, developers, documents, externalSignatures, internalSignatures, relatedFormats, droidSignatureFileVersion, droidContainerFileVersion, localLastModifiedDate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileFormat {\n");

        sb.append("    puid: ").append(toIndentedString(puid)).append("\n");
        sb.append("    puidNamespace: ").append(toIndentedString(puidNamespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    families: ").append(toIndentedString(families)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    disclosure: ").append(toIndentedString(disclosure)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    binaryFileFormat: ").append(toIndentedString(binaryFileFormat)).append("\n");
        sb.append("    byteOrders: ").append(toIndentedString(byteOrders)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("    withdrawnDate: ").append(toIndentedString(withdrawnDate)).append("\n");
        sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
        sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    technicalEnvironment: ").append(toIndentedString(technicalEnvironment)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    developers: ").append(toIndentedString(developers)).append("\n");
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
        sb.append("    externalSignatures: ").append(toIndentedString(externalSignatures)).append("\n");
        sb.append("    internalSignatures: ").append(toIndentedString(internalSignatures)).append("\n");
        sb.append("    relatedFormats: ").append(toIndentedString(relatedFormats)).append("\n");
        sb.append("    droidSignatureFileVersion: ").append(toIndentedString(droidSignatureFileVersion)).append("\n");
        sb.append("    droidContainerFileVersion: ").append(toIndentedString(droidContainerFileVersion)).append("\n");
        sb.append("    localLastModifiedDate: ").append(toIndentedString(localLastModifiedDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

