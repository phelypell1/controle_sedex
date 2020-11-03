import { Empresa } from './empresa';
import { Estado } from './estado';
import { Cidade } from './Cidade';

export class Destinatario{

	DES_Codigo: number;
	DES_Destinatario: Empresa;
	DES_AC: string;
	DES_AcAbreviado: string;
	DES_CPF: string;
	DES_Logradouro: string;
	DES_Numero: string;
	DES_Complemento: string;
	DES_Bairro: string;
	CID_Codigo: Cidade;
	EST_Codigo: Estado;
	DES_CEP: string;
	DES_Fixo: string;
	DES_Movel: string;
	DES_Transportadora: Empresa;
	DES_Ativo: boolean;
	DES_Operador: number;
	DES_DataAlteracao: Date;
	DES_Latitude: string;
	DES_Longitude: string;

}