package implement;

import persist.EspecializacaoDao;

public class EspecializacaoDaoImp{
private  EspecializacaoDao dao;

public EspecializacaoDaoImp(){
dao = new EspecializacaoDao();
}
public boolean gravar(Especializacao e){
try{
dao.gravar(e);
return true;
}catch(SQLException ex){
ex.printStrackTrace();
}
return false;
}
}