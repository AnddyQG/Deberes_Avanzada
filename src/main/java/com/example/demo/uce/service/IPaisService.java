package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Pais;

public interface IPaisService {
public void insertar(Pais pais);
public void modificar(Pais pais);
public Pais buscar(Integer id);
public void eliminar(Integer id);
}
