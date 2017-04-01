package com.lumi.pdmod.data;

import com.lumi.pdmod.RLoader;

/**
 * Created by Luis Michaelis on 31.03.2017.
 * Updated by Jan-Torben Sendke on 01.04.2017
 */
public class BlobData {
    public static final String BLOB_FIRE_DESC = RLoader.get("BlobData.fire.desc");
    public static final String BLOB_FOLIAGE_DESC = RLoader.get("BlobData.garden.desc");
    public static final String BLOB_WEB_DESC = RLoader.get("BlobData.web.desc");
    // Gase
    public static final String BLOB_GAS_CONFUSION_DESC = RLoader.get("BlobData.cloudof.conf-gas");
    public static final String BLOB_GAS_TOXIC_DESC = RLoader.get("BlobData.cloudof.toxic-gas");
    public static final String BLOB_GAS_PARALYTIC_DESC = RLoader.get("BlobData.cloudof.paralytic-gas");
    // Sacrificial fire
    public static final String BLOB_SACRIFICIAL_FIRE_MARKED = "Marked for sacrifice";
    public static final String BLOB_SACRIFICIAL_FIRE_WORTHY = "\"Your sacrifice is worthy...\" ";
    public static final String BLOB_SACRIFICIAL_FIRE_UNWORTHY = "\"Your sacrifice is unworthy...\" ";
    public static final String BLOB_SACRIFICIAL_FIRE_REWARD = "\"Your sacrifice is worthy and so you are!\" ";
    public static final String BLOB_SACRIFICIAL_FIRE_DESC = "Sacrificial fire burns here. Every creature touched by this fire is marked as an offering for the spirits of the dungeon.";
    // Wasser Brunnen
    public static final String BLOB_WATER_AWARENESS_PROCEED = RLoader.get("BlobData.waterofawareness");
    public static final String BLOB_WATER_AWARENESS_DESC = RLoader.get("BlobData.waterofawareness.desc");
    public static final String BLOB_WATER_HEALTH_PROCEED = RLoader.get("BlobData.health");
    public static final String BLOB_WATER_HEALTH_DESC = RLoader.get("BlobData.health.desc");
    public static final String BLOB_WATER_TRANSMUTATION_DESC = RLoader.get("BlobData.transform.desc");
}
