package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Dubl_Q$;
import CC.$.Q2$_LMNt.Q_Byt$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl_Byt$ extends Dubl_Q$,Q_Byt$
{
	Clas_Rap Class=Init_StRt_Nd(Dubl_Byt$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Dubl_Byt$(double A,byte B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Bytg$(double[] Ag,byte[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Dubl_Byt$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg_Bytg$(Iterable<Double> Ag,Iterable<Byte> Bg)
		{
			Iterator<Double> A_Itr=Ag.iterator();
			Iterator<Byte> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Dubl_Byt$(A_Itr.next(),B_Itr.next());}
		}
}