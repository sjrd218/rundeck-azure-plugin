package com.rundeck.plugins.azure.azure

import com.microsoft.azure.management.resources.fluentcore.arm.Region

/**
 * Created by luistoledo on 11/6/17.
 */
class AzureManagerBuilder {

    String clientId
    String tenantId
    String subscriptionId
    String key
    String pfxCertificatePath
    String pfxCertificatePassword

    String resourceGroup
    boolean onlyRunningInstances
    Region region

    boolean debug


    static AzureManagerBuilder builder() {
        return new AzureManagerBuilder()
    }

    /**
     * @param clientId Azure Client ID
     * @return this builder
     */
    AzureManagerBuilder clientId(String clientId){
        this.clientId = clientId
        return this
    }

    /**
     * @param tenantId Azure Tenant ID
     * @return this builder
     */
    AzureManagerBuilder tenantId(String tenantId){
        this.tenantId = tenantId
        return this
    }

    /**
     * @param subscriptionId Azure Subscription ID
     * @return this builder
     */
    AzureManagerBuilder subscriptionId(String subscriptionId){
        this.subscriptionId = subscriptionId
        return this
    }

    /**
     * @param key Azure Key
     * @return this builder
     */
    AzureManagerBuilder key(String key){
        this.key = key
        return this
    }

    /**
     * @param pfxCertificatePath Azure Certificate Path
     * @return this builder
     */
    AzureManagerBuilder pfxCertificatePath(String pfxCertificatePath){
        this.pfxCertificatePath = pfxCertificatePath
        return this
    }

    /**
     * @param pfxCertificatePassword Azure Certificate Password
     * @return this builder
     */
    AzureManagerBuilder pfxCertificatePassword(String pfxCertificatePassword){
        this.pfxCertificatePassword = pfxCertificatePassword
        return this
    }

    /**
     * @param resourceGroup Azure Resource Group
     * @return this builder
     */
    AzureManagerBuilder resourceGroup(String resourceGroup){
        this.resourceGroup = resourceGroup
        return this
    }

    /**
     * @param onlyRunningInstances Only Running instances
     * @return this builder
     */
    AzureManagerBuilder onlyRunningInstances(boolean onlyRunningInstances){
        this.onlyRunningInstances = onlyRunningInstances
        return this
    }

    /**
     * @param onlyRunningInstances Only Running instances
     * @return this builder
     */
    AzureManagerBuilder region(Region region){
        this.region = region
        return this
    }

    /**
     * @param onlyRunningInstances Only Running instances
     * @return this builder
     */
    AzureManagerBuilder debug(boolean debug){
        this.debug = debug
        return this
    }


    AzureManager build(){

        AzureManager azure = new AzureManager()
        azure.setClientId(this.clientId)
        azure.setTenantId(this.tenantId)
        azure.setSubscriptionId(this.subscriptionId)
        azure.setKey(this.key)
        azure.setPfxCertificatePath(this.pfxCertificatePath)
        azure.setPfxCertificatePassword(this.pfxCertificatePassword)
        azure.setResourceGroup(this.resourceGroup)
        azure.setOnlyRunningInstances(this.onlyRunningInstances)
        azure.setDebug(debug)

        return azure
    }

}
