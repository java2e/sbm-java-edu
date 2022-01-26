package proje.ilan.service;

/*
Arayüz
Şablon oluşturma
Nesne üretmezsiniz!

mutlaka ve mutlaka bir class olmalıd ve bos olamaz!

new anahtar

Collection Framework

List,HashMap,Set vector, arraylist

List => interface
ArrayList => Class
 --- index numarasına göre elemanları kayddedir 0,1,2,3,4,5
Set => interface
HashSet => Class
 ---  karısık bir sekilde hash göre veriyi tutar duplicate
Map => interface
HashMap => Class
 --- Key Value değerler tutmaktır
 01 -> Adana

diziler yapmıs oldugunuz işlemleri

 */

import java.util.List;

public interface BaseService {

    public List<?> getList();

}
