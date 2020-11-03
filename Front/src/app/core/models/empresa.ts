import { TipoEmpresa } from './tipoEmpresa';
import { Estado } from './estado';
import { Cidade } from './Cidade';

export class Empresa{
    
	EMP_Codigo: number;
	EMP_CNPJ: string;
	EMP_RasaoSocial: string;
	EMP_TipoEmpresa: string;
	EMP_Descricao: string;
	EMP_Logradouro: string;
	EMP_Numero: string;
	EMP_Complemento: string;
	EMP_Bairro: string;
	CID_Codigo: Cidade;
	EST_Codigo: Estado;
	EMP_CEP: string;
	EMP_Fixo: string;
	TEM_Codigo: TipoEmpresa;
}