package test;

import implement.EnderecoDaoImp;

public class TestLocalizarEnderecoId {
public static void main(String[] args) {

EnderecoDaoImp imp = new EnderecoDaoImp();

System.out.println(imp.buscarPorId());
}
}