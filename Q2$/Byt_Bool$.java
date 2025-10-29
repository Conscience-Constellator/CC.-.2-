package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Byt_Q$;
import CC.$.Q2$_LMNt.Q_Bool$;

import java.util.Iterator;

public interface Byt_Bool$ extends Byt_Q$,Q_Bool$
{
	Clas_Rap Class=Init_StRt_Nd(Byt_Bool$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Byt_Bool$(byte A,boolean B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Boolg$(byte[] Ag,boolean[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Byt_Bool$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Boolg$(Iterable<Byte> Ag,Iterable<Boolean> Bg)
		{
			Iterator<Byte> A_Itr=Ag.iterator();
			Iterator<Boolean> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Byt_Bool$(A_Itr.next(),B_Itr.next());}
		}
}