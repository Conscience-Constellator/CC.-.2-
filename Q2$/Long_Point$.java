package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Long_Q$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Long_Point$<q_Q$_Typ> extends
		Long_Q$,
		Int_Point$<q_Q$_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Long_Point$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Long_Point$(long A,q_Q$_Typ B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Pointg$(long[] Ag,q_Q$_Typ[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Long_Point$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg_Pointg$(Iterable<Long> Ag,Iterable<q_Q$_Typ> Bg)
		{
			Iterator<Long> A_Itr=Ag.iterator();
			Iterator<q_Q$_Typ> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Long_Point$(A_Itr.next(),B_Itr.next());}
		}
}