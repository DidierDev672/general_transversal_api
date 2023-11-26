package org.acme.domain.Menu.models;

import java.util.UUID;

public class Menu {
    private UUID uuid;
    private String key;
    private String title;
    private String icon;
    private String url;
    private String uuidmodule;
    private String idparent;

    public Menu() {
    }

    private Menu(UUID uuid, String key, String title, String icon, String url, String uuidmodule, String idparent) {
        this.uuid = uuid;
        this.key = key;
        this.title = title;
        this.icon = icon;
        this.url = url;
        this.uuidmodule = uuidmodule;
        this.idparent = idparent;
    }

    public static Menu init(UUID uuid, String key, String title, String icon, String url, String uuidmodule,
            String idparent) {
        return new Menu(uuid, key, title, icon, url, uuidmodule, idparent);
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getuuidmodule() {
        return uuidmodule;
    }

    public void setuuidmodule(String uuidmodule) {
        this.uuidmodule = uuidmodule;
    }

    public String getidparent() {
        return idparent;
    }

    public void setidparent(String idparent) {
        this.idparent = idparent;
    }
}
