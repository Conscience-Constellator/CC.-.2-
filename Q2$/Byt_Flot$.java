package CC.$.Q2$;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q2$_LMNt.Byt_Q$;
import CC.$.Q2$_LMNt.Q_Flot$;

import java.util.Iterator;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Byt_Flot$ extends Byt_Q$,Q_Flot$
{
	Clas_Rap Class=Init_StRt_Nd(Byt_Flot$.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar void Byt_Flot$(byte A,float B);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Flotg$(byte[] Ag,float[] Bg){for(int IndX=0;IndX<Ag.length;IndX+=1){Byt_Flot$(Ag[IndX],Bg[IndX]);}}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg_Flotg$(Iterable<Byte> Ag,Iterable<Float> Bg)
		{
			Iterator<Byte> A_Itr=Ag.iterator();
			Iterator<Float> B_Itr=Bg.iterator();
			while(A_Itr.hasNext()){Byt_Flot$(A_Itr.next(),B_Itr.next());}
		}
}