package com.uam.admision.aspirantesunidades.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "aspirante_r")
public class AspiranteR implements Serializable {
  private Long referencia_nu;
  private String u_version;
  aspirante_cl varchar(15),
  pago_reg_lo bit,
  enc_se_c_lo bit,
  foto_rec_lo bit,
  folio_exa_cl int,
  usuario_cl numeric(11),
  actualiza_fe datetime,
  pago_fe datetime,
  enc_co_fe datetime,
  foto_rec_fe datetime,
  folio_asg_fe datetime,
  registro_fe datetime,
  archivo_xx varchar(16),
  serv_foto_xx varchar(25),
  l_asg_fol_lo bit,
  rev_dob_mat_cl tinyint,
  banco_pago_cl tinyint,
  edo_v_foto_cl tinyint,
  edo_v_pago_cl tinyint,
  cantidad_nu float,
  cantidad_p_nu float,
  ref_pago_bx_xx varchar(40),
  ref_pago_ba_xx varchar(40),
  ref_pago_ss_xx varchar(40),
  gen_ref_ban_fe datetime,
  usuario_rf_cl numeric(11),
  actual_rf_fe datetime,
  imp_comp_fe datetime
}
