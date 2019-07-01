package DAO;

import testedehibernate.Teste;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class TesteDAO {
    Session sessao;
    
    public Session conectar(){
        return NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public void desconectar(){
        sessao.close();
    }
    
    public ArrayList<Teste> listar(){
       ArrayList<Teste> lista = new ArrayList<>();
       sessao = this.conectar();
       Transaction tx = sessao.beginTransaction();
       lista = (ArrayList<Teste>) sessao.createQuery("from Teste").list();
       tx.commit();
       this.desconectar();
       return lista;
    }
    
    public void adicionar (Teste novo){
        sessao = this.conectar();
        Transaction tx = sessao.beginTransaction();
        sessao.persist(novo);
        tx.commit();
        this.desconectar();
    }
    
    public void deletar(int id) {
        sessao = this.conectar();
        Transaction tx = sessao.beginTransaction();
        sessao.delete(id);
        tx.commit();
        this.desconectar();        
    }
}
