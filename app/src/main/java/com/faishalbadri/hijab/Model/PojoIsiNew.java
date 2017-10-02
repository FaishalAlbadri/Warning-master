package com.faishalbadri.hijab.Model;

import java.util.List;

/**
 * Created by faishal on 9/14/17.
 */

public class PojoIsiNew {

    /**
     * isi : [{"id_isi":"38","id_admin":"1","id_kategori":"2","isi_judul":"jam terbaru hilang ditengah jalan","admin_nama":"admin","kategori_nama":"shvdy1iu]\\","isi_keterangan":"\nasdw123<\/p>\r\n","isi_tgl_upload":"2017-09-12 10:08:17","isi_kunjungan":"1","isi_gambar":"example.png"},{"id_isi":"37","id_admin":"1","id_kategori":"6","isi_judul":"pikcoy","admin_nama":"admin","kategori_nama":"iougbiblk","isi_keterangan":"\n\nasdvhkyuqv2u1y<\/p>\r\n","isi_tgl_upload":"2017-09-11 07:26:41","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"36","id_admin":"1","id_kategori":"2","isi_judul":"faishalasdas","admin_nama":"admin","kategori_nama":"shvdy1iu]\\","isi_keterangan":"asd1w1d1213","isi_tgl_upload":"2017-09-11 14:15:19","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"35","id_admin":"1","id_kategori":"4","isi_judul":"faishal123123","admin_nama":"admin","kategori_nama":"asd1ew12","isi_keterangan":"\n\nasdbj12b1kl2b<\/p>\r\n","isi_tgl_upload":"2017-09-11 14:13:49","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"34","id_admin":"1","id_kategori":"6","isi_judul":"asd1212","admin_nama":"admin","kategori_nama":"iougbiblk","isi_keterangan":"\n\nasd12esda<\/p>\r\n","isi_tgl_upload":"2017-09-11 14:13:06","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"33","id_admin":"1","id_kategori":"11","isi_judul":"faishal","admin_nama":"admin","kategori_nama":"dfgwe32","isi_keterangan":"\n\nasdu1bwiub1iubdiu1<\/p>\r\n","isi_tgl_upload":"2017-09-11 14:02:17","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"32","id_admin":"1","id_kategori":"1","isi_judul":"Example","admin_nama":"admin","kategori_nama":"sd121","isi_keterangan":"exemple aja","isi_tgl_upload":"2017-09-11 14:02:17","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"31","id_admin":"1","id_kategori":"1","isi_judul":"Example","admin_nama":"admin","kategori_nama":"sd121","isi_keterangan":"exemple aja","isi_tgl_upload":"2017-09-11 14:02:17","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"30","id_admin":"1","id_kategori":"1","isi_judul":"Example","admin_nama":"admin","kategori_nama":"sd121","isi_keterangan":"exemple aja","isi_tgl_upload":"2017-09-11 14:02:17","isi_kunjungan":"0","isi_gambar":"example.png"},{"id_isi":"29","id_admin":"1","id_kategori":"1","isi_judul":"Example","admin_nama":"admin","kategori_nama":"sd121","isi_keterangan":"exemple aja","isi_tgl_upload":"2017-09-11 14:02:17","isi_kunjungan":"0","isi_gambar":"example.png"}]
     * status : 1
     * msg : Data Semua Isi
     */

    private String status;
    private String msg;
    private List<IsiBean> isi;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<IsiBean> getIsi() {
        return isi;
    }

    public void setIsi(List<IsiBean> isi) {
        this.isi = isi;
    }

    public static class IsiBean {
        /**
         * id_isi : 38
         * id_admin : 1
         * id_kategori : 2
         * isi_judul : jam terbaru hilang ditengah jalan
         * admin_nama : admin
         * kategori_nama : shvdy1iu]\
         * isi_keterangan :
         asdw123</p>

         * isi_tgl_upload : 2017-09-12 10:08:17
         * isi_kunjungan : 1
         * isi_gambar : example.png
         */

        private String id_isi;
        private String id_admin;
        private String id_kategori;
        private String isi_judul;
        private String admin_nama;
        private String kategori_nama;
        private String isi_keterangan;
        private String isi_tgl_upload;
        private Double isi_kunjungan;
        private String isi_gambar;

        public String getId_isi() {
            return id_isi;
        }

        public void setId_isi(String id_isi) {
            this.id_isi = id_isi;
        }

        public String getId_admin() {
            return id_admin;
        }

        public void setId_admin(String id_admin) {
            this.id_admin = id_admin;
        }

        public String getId_kategori() {
            return id_kategori;
        }

        public void setId_kategori(String id_kategori) {
            this.id_kategori = id_kategori;
        }

        public String getIsi_judul() {
            return isi_judul;
        }

        public void setIsi_judul(String isi_judul) {
            this.isi_judul = isi_judul;
        }

        public String getAdmin_nama() {
            return admin_nama;
        }

        public void setAdmin_nama(String admin_nama) {
            this.admin_nama = admin_nama;
        }

        public String getKategori_nama() {
            return kategori_nama;
        }

        public void setKategori_nama(String kategori_nama) {
            this.kategori_nama = kategori_nama;
        }

        public String getIsi_keterangan() {
            return isi_keterangan;
        }

        public void setIsi_keterangan(String isi_keterangan) {
            this.isi_keterangan = isi_keterangan;
        }

        public String getIsi_tgl_upload() {
            return isi_tgl_upload;
        }

        public void setIsi_tgl_upload(String isi_tgl_upload) {
            this.isi_tgl_upload = isi_tgl_upload;
        }

        public Double getIsi_kunjungan() {
            return isi_kunjungan;
        }

        public void setIsi_kunjungan(Double isi_kunjungan) {
            this.isi_kunjungan = isi_kunjungan;
        }

        public String getIsi_gambar() {
            return isi_gambar;
        }

        public void setIsi_gambar(String isi_gambar) {
            this.isi_gambar = isi_gambar;
        }
    }
}
