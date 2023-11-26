package org.acme.infrastructure.driven.postgresdriven.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "g_menu", schema = "wangplus")
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class MenuEntity {
  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @org.hibernate.annotations.ColumnDefault("uuid_generate_v4()")
  @Column(name = "uuid", nullable = false)
  private UUID uuid;

  @Column(name = "key", nullable = false, length = 6)
  private String key;

  @Column(name = "title", nullable = false, length = 200)
  private String title;

  @Column(name = "icon", nullable = false, length = 200)
  private String icon;

  @Column(name = "url", nullable = false, length = 200)
  private String url;

  @Column(name = "uuidmodule", nullable = false, length = 200)
  private String uuidmodule;

  @Column(name = "idparent", nullable = false, length = 200)
  private String idparent;
}
