/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

import java.sql.SQLException;
import projetovendas.interfaces.IOperacao;
import java.sql.Statement;

public class Estado implements IOperacao {

    private String sigla_estado;
    private String nome_estado;

    private Statement mysqStatement = null;

    public String getSigla_estado() {
        return sigla_estado;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    @Override
    public void cadastrar() {
        String insert = "insert into estado(sigla_estado, nome_estado)"
                + "values ('" + getSigla_estado() + "','" + getNome_estado() + "')";
        mysqStatement = ConexaoDB.getStatement();

        try {
            mysqStatement.executeUpdate(insert);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean alterar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public void cancelar() {
      
    }

    @Override
    public String toString() {
        return "Estado{" + "sigla_estado=" + sigla_estado + ", nome_estado=" + nome_estado + ", mysqStatement=" + mysqStatement + '}';
    }

}
