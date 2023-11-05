package org.example.classes;

import org.example.interfaces.IBalanca;

import java.security.InvalidParameterException;

public class FabricaBalanca {

    public static IBalanca<Produto> getBalance(TipoDeBalanca tipoDeBalanca) {

        if(tipoDeBalanca == null){
            throw new InvalidParameterException("Parametro nao reconhecido");
        }
        if(TipoDeBalanca.FINZOLA_SMART.equals(tipoDeBalanca)){
            return new BalancaFizola();
        } else if (TipoDeBalanca.TOLETO_MGV6.equals(tipoDeBalanca)) {
            return new BalancaToledo();
        }
        else if(TipoDeBalanca.URANO_INTEGRA.equals(tipoDeBalanca)){
            return new BalancaUranoIntegra();
        }
        return null;
    }
}
