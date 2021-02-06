package com.kadal.ilang.aplikasiregistrasi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class registrasiController {

    @GetMapping("/registrasi")
    public void tampilkanFormRegistrasi(){
        log.info("menampilkan halaman registrasi");

    }

    @GetMapping("/konfirmasi")
    public void konfirmasiHalamanKonfirmasi(){
        log.info("menampilkan halaman konfirmasi");
    }
}
