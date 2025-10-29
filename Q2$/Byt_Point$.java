package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Byt_Q$;
import CC.$.Q2$_LMNt.Q_Point$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Byt_Point$<B_Typ> extends Byt_Q$,Q_Point$<B_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Byt_Point$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Byt_Point$(byte A,B_Typ B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Pointg$(byte[] Ag,B_Typ[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Byt_Point$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Pointg$(Iterable<Byte> Ag,Iterable<B_Typ> Bg)
		{
			Iterator<Byte> A_Itr=Ag.iterator();
			Iterator<B_Typ> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Byt_Point$(A_Itr.next(),B_Itr.next());}
		}
}