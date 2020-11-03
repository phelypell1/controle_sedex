import { TipoEquipamento } from './tipoEquipamento';
import { TipoItem } from './tipoItem';
import { RegistroSedex } from './registroSedex';

export class RegistroItens{

	IPS_Codigo: number;
	SED_Codigo: RegistroSedex;
	TIT_Codigo: TipoItem;
	IPS_Descricao: string;
	EQU_Codigo: TipoEquipamento;
	IPS_CodEquiq: string;
	IPS_CodRA: string;
}